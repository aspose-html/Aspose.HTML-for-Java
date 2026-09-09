[CmdletBinding()]
param(
    [string]$RootPath = $PSScriptRoot
)

$resolvedRootPath = (Resolve-Path -LiteralPath $RootPath).Path
$extensions = @('.java', '.json', '.md','.html')
$changedFiles = 0

Get-ChildItem -LiteralPath $resolvedRootPath -Recurse -File |
    Where-Object { $extensions -contains $_.Extension.ToLowerInvariant() } |
    ForEach-Object {
        $filePath = $_.FullName
        [byte[]]$content = [System.IO.File]::ReadAllBytes($filePath)
        $normalizedContent = New-Object System.Collections.Generic.List[byte]
        $wasChanged = $false

        for ($index = 0; $index -lt $content.Length; $index++) {
            if ($content[$index] -eq 13 -and $index + 1 -lt $content.Length -and $content[$index + 1] -eq 10) {
                $normalizedContent.Add(10)
                $index++
                $wasChanged = $true
            }
            else {
                $normalizedContent.Add($content[$index])
            }
        }

        if ($wasChanged) {
            [System.IO.File]::WriteAllBytes($filePath, $normalizedContent.ToArray())
            $changedFiles++
            Write-Host "Normalized $filePath"
        }
    }

Write-Host "Normalized line endings in $changedFiles file(s)."
