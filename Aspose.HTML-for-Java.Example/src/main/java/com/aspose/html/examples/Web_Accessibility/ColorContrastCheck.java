package com.aspose.html.examples.Web_Accessibility;

import com.aspose.html.HTMLDocument;
import com.aspose.html.HTMLElement;
import com.aspose.html.accessibility.*;
import com.aspose.html.accessibility.results.RuleValidationResult;
import com.aspose.html.accessibility.results.ValidationResult;
import com.aspose.html.utils.collections.generic.List;
import org.junit.jupiter.api.DisplayName;

import static com.aspose.html.examples.utils.Resources.$i;

public class ColorContrastCheck {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Check Color Contrast Against Specific Accessibility Criteria")
    public final void checkColorContrastAgainstAccessibilityCriteriaTest() {
        // @START_SNIPPET Example_CheckColorContrastAgainstAccessibilityCriteria.java
        // Check color contrast on an HTML document using Java
        // Learn more: https://docs.aspose.com/html/java/check-color-contract/

        // Prepare a path to a source HTML file
        String documentPath = $i("check-color.html");

        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Get Principle "1.Perceivable" by code "1" and get guideline "1.4"
        Guideline guideline = webAccessibility.getRules()
                .getPrinciple("1").getGuideline("1.4");

        // Get criterion by code, for example 1.4.3
        Criterion criterion = guideline.getCriterion("1.4.3");

        // Create an accessibility validator, pass the found guideline
        // as parameters and specify the full validation settings
        AccessibilityValidator validator = webAccessibility.createValidator(
                criterion,
                ValidationBuilder.getAll()
        );

        final HTMLDocument document = new HTMLDocument(documentPath);
        ValidationResult validationResult = validator.validate(document);
        if (!validationResult.getSuccess()) {
            // Get all result details
            for (RuleValidationResult ruleResult : validationResult.getDetails()) {
                // If the result of the rule is unsuccessful
                if (!ruleResult.getSuccess()) {
                    // Get errors list
                    for (ITechniqueResult result : ruleResult.getErrors()) {
                        // Check the type of the erroneous element, in this case
                        // we have an error in the html element rule
                        if (result.getError().getTarget().getTargetType() == TargetTypes.HTMLElement) {
                            // Element of file with error
                            HTMLElement rule = (HTMLElement) result.getError().getTarget().getItem();

                            System.out.println(String.format("Error in rule %s : %s",
                                    result.getRule().getCode(), result.getError().getErrorMessage()));

                            System.out.println(String.format("CSS Rule: %s",
                                    rule.getOuterHTML()));
                        }
                    }
                }
            }
        }
        // @END_SNIPPET CheckColorContrastAgainstAccessibilityCriteria
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Check Color Contrast")
    public final void checkColorContrastTest() {
        // @START_SNIPPET Example_CheckHtmlAccessibilityColorContrast.java
        // Validate HTML accessibility for color contrast in Java using WCAG criteria
        // Learn more: https://docs.aspose.com/html/java/check-color-contract/

        // Prepare a path to a source HTML file
        String documentPath = $i("check-color.html");

        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Get Principle "1.Perceivable" by code "1" and get guideline "1.4"
        Guideline guideline = webAccessibility.getRules()
                .getPrinciple("1").getGuideline("1.4");

        // Get criterion by code, for example 1.4.3
        Criterion criterion143 = guideline.getCriterion("1.4.3");

        // Get criterion by code, for example 1.4.6
        Criterion criterion146 = guideline.getCriterion("1.4.6");

        // Create an accessibility validator, pass the found guideline
        // as parameters and specify the full validation settings
        List<IRule> rules = new List<>();
        rules.add(criterion143);
        rules.add(criterion146);

        AccessibilityValidator validator = webAccessibility.createValidator(
                rules,
                ValidationBuilder.getAll()
        );

        final HTMLDocument document = new HTMLDocument(documentPath);
        ValidationResult validationResult = validator.validate(document);
        if (!validationResult.getSuccess()) {
            System.out.println(validationResult.saveToString());
        }
        // @END_SNIPPET CheckColorContrast
    }
}