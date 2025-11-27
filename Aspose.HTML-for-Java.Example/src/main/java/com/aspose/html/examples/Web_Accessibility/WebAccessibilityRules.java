package com.aspose.html.examples.Web_Accessibility;

import com.aspose.html.HTMLDocument;
import com.aspose.html.accessibility.*;
import com.aspose.html.accessibility.results.ValidationResult;
import com.aspose.html.utils.collections.generic.List;
import org.junit.jupiter.api.DisplayName;

import static com.aspose.html.examples.utils.Resources.$i;

public class WebAccessibilityRules {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Check HTML Against Specific Web Accessibility Rules")
    public final void checkHTMLAgainstSpecificWebAccessibilityRulesTest() {
        // @START_SNIPPET Example_CheckHtmlAgainstSpecificWebAccessibilityRules.java
        // Validate an HTML document using specific rule codes with Java
        // Learn more: https://docs.aspose.com/html/java/web-accessibility-rules/

        String htmlPath = $i("input.html");

        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // List of necessary rules for checking (rule code according to the specification) 
        String[] rulesCode = new String[]{"H2", "H37", "H67", "H86"};

        // Get the required IList<Rule> rules from the rules reference
        List<IRule> rules = webAccessibility.getRules().getRules(rulesCode);

        // Create an accessibility validator, pass the found rules as parameters,
        // and specify the full validation settings
        AccessibilityValidator validator = webAccessibility.createValidator(
                rules, ValidationBuilder.getAll());

        // Initialize an object of the HTMLDocument
        final HTMLDocument document = new HTMLDocument(htmlPath);
        // Check the document
        ValidationResult validationResult = validator.validate(document);

        // Return the result in string format
        // SaveToString - return only errors and warnings
        System.out.println(validationResult.saveToString());
        // @END_SNIPPET CheckHTMLAgainstSpecificWebAccessibilityRules
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("GetRules")
    public final void getRulesTest() {
        // @START_SNIPPET Example_GetAccessibilityRulesByCode.java
        // Retrieve and list accessibility rules by code with their descriptions from the rules repository
        // Learn more: https://docs.aspose.com/html/java/web-accessibility-rules/

        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // List of rule codes can contain both technique codes and principles,
        // guidelines and criteria - all rules that implement the interface IRule
        String[] rulesCodes = new String[]{"H2", "H37", "H30", "1.1", "1.2.1"};

        // Get a list of IRule objects; if a rule with the specified code is not found,
        // it will not be in the list
        List<IRule> rules = webAccessibility.getRules().getRules(rulesCodes);

        // Get code and description of rule
        for (IRule rule : rules) {
            System.out.println(String.format("%s: %s",
                    rule.getCode(),
                    rule.getDescription()
            ));
        }
        // @END_SNIPPET GetRules
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("GetPrinciple")
    public final void getPrincipleTest() {
        // @START_SNIPPET Example_GetAccessibilityPrincipleByCode.java
        // Get accessibility principle by code from WCAG rules in Aspose.HTML for Java
        // Learn more: https://docs.aspose.com/html/java/web-accessibility-rules/

        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Get the principle by code
        Principle rule = webAccessibility.getRules().getPrinciple("1");

        // Get code and description of principle
        System.out.println(String.format("%s: %s",
                rule.getCode(),
                rule.getDescription()
        ));
        // @output: 1:Perceivable
        // @END_SNIPPET GetPrinciple
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("GetGuideline")
    public final void getGuidelineTest() {
        // @START_SNIPPET Example_GetAccessibilityGuideline.java
        // Get accessibility guideline by code from WCAG principle in Aspose.HTML for Java
        // Learn more: https://docs.aspose.com/html/java/web-accessibility-rules/

        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Get the principle by code 
        Principle principle = webAccessibility.getRules().getPrinciple("1");

        // Get guideline 1.1
        Guideline guideline = principle.getGuideline("1.1");
        if (guideline != null) {
            System.out.println(String.format("%s: %s, %s",
                    guideline.getCode(),
                    guideline.getDescription(),
                    guideline
            ));
            // @output: 1.1:Text Alternatives
        }
        // @END_SNIPPET GetGuideline
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("GetCriterion")
    public final void getCriterionTest() {
        // @START_SNIPPET Example_GetAccessibilityCriterion.java
        // Get accessibility criterion and its sufficient techniques in Java
        // Learn more: https://docs.aspose.com/html/java/web-accessibility-rules/

        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Get the principle by code 
        Principle principle = webAccessibility.getRules().getPrinciple("1");

        // Get guideline 
        Guideline guideline = principle.getGuideline("1.1");

        // Get criterion by code
        Criterion criterion = guideline.getCriterion("1.1.1");
        if (criterion != null) {
            System.out.println(String.format("%s: %s - %s",
                    criterion.getCode(),
                    criterion.getDescription(),
                    criterion.getLevel()
            ));
            // @output: 1.1.1:Non-text Content - A

            // Get all Sufficient Techniques and write to console
            for (IRule technique : criterion.getSufficientTechniques())
                System.out.println(String.format("%s: %s",
                        technique.getCode(),
                        technique.getDescription()
                ));
        }
        // @END_SNIPPET GetCriterion
    }
}
