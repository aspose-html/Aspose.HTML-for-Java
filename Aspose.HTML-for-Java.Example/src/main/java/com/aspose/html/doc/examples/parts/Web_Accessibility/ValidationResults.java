package com.aspose.html.doc.examples.parts.Web_Accessibility;

import com.aspose.html.HTMLDocument;
import com.aspose.html.accessibility.AccessibilityValidator;
import com.aspose.html.accessibility.ITechniqueResult;
import com.aspose.html.accessibility.ValidationBuilder;
import com.aspose.html.accessibility.WebAccessibility;
import com.aspose.html.accessibility.results.RuleValidationResult;
import com.aspose.html.accessibility.results.ValidationResult;
import org.junit.jupiter.api.DisplayName;

import static com.aspose.html.doc.examples.utils.Resources.$i;

public class ValidationResults {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("ValidationResult")
    public final void validationResultTest() {
        // @START_SNIPPET ValidationResult
        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Create an accessibility validator with static instance for all rules
        // from repository that match the builder settings
        AccessibilityValidator validator = webAccessibility.createValidator(ValidationBuilder.getAll());

        // Prepare a path to a source HTML file
        String documentPath = $i("input.html");

        // Initialize an object of the HTMLDocument class
        final HTMLDocument document = new HTMLDocument(documentPath);
        ValidationResult validationResult = validator.validate(document);

        // Checking for success
        if (!validationResult.getSuccess()) {
            // Get a list of RuleValidationResult Details
            for (RuleValidationResult detail : validationResult.getDetails()) {
                System.out.println(String.format("%s: %s = %s",
                        detail.getRule().getCode(),
                        detail.getRule().getDescription(),
                        detail.getSuccess()));
            }
        }
        // @END_SNIPPET ValidationResult
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("RuleValidationResult")
    public final void criterionResultTest() {
        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Create an accessibility validator with static instance for all rules
        // from repository that match the builder settings
        AccessibilityValidator validator = webAccessibility.createValidator(ValidationBuilder.getAll());

        // Prepare a path to a source HTML file
        String documentPath = $i("input.html");

        // Initialize an object of the HTMLDocument class
        final HTMLDocument document = new HTMLDocument(documentPath);
        ValidationResult validationResult = validator.validate(document);

        // Get a list of RuleValidationResult Details
        for (RuleValidationResult result : validationResult.getDetails()) {
            System.out.println(String.format("%s: %s = %s",
                    result.getRule().getCode(),
                    result.getRule().getDescription(),
                    result.getSuccess()
            ));
        }
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("ITechniqueResult")
    public final void IRuleResultTest() {
        // @START_SNIPPET IRuleResult
        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Create an accessibility validator with static instance for all rules
        // from repository that match the builder settings
        AccessibilityValidator validator = webAccessibility.createValidator(ValidationBuilder.getAll());

        String documentPath = $i("input.html");

        // Initialize an object of the HTMLDocument class
        final HTMLDocument document = new HTMLDocument(documentPath);
        ValidationResult validationResult = validator.validate(document);

        // Take a list of rules results
        for (RuleValidationResult ruleResult : validationResult.getDetails()) {
            // List only unsuccessful rule
            if (!ruleResult.getSuccess()) {
                // Print the code and description of the rule
                System.out.println(String.format("%s: %s",
                        ruleResult.getRule().getCode(),
                        ruleResult.getRule().getDescription()
                ));

                // Print the results of all methods
                for (ITechniqueResult ruleDetail : ruleResult.getResults()) {
                    // Print the code and description of the criterions
                    StringBuilder str = new StringBuilder(String.format("\n{0}: {1} - {2}",
                            ruleDetail.getRule().getCode(),
                            ruleDetail.getSuccess(),
                            ruleDetail.getRule().getDescription()
                    ));
                    System.out.println(str);
                }
            }
        }
        // @END_SNIPPET IRuleResult
    }
}