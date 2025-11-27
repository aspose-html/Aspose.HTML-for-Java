package com.aspose.html.examples.Web_Accessibility;

import com.aspose.html.HTMLDocument;
import com.aspose.html.HTMLElement;
import com.aspose.html.accessibility.*;
import com.aspose.html.accessibility.results.RuleValidationResult;
import com.aspose.html.accessibility.results.ValidationResult;
import com.aspose.html.accessibility.saving.ValidationResultSaveFormat;
import com.aspose.html.dom.css.ICSSStyleRule;
import com.aspose.html.dom.css.ICSSStyleSheet;
import org.junit.jupiter.api.DisplayName;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class WebAccessibilityCheck {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Web Accessibility Check")
    public final void webAccessibilityCheckTest() {
        // @START_SNIPPET Example_WebAccessibilityCheck.java
        // Check HTML document for WCAG compliance in Java and log each rule code, description, and pass status
        // Learn more: https://docs.aspose.com/html/java/web-accessibility/

        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Create an accessibility validator
        AccessibilityValidator validator = webAccessibility.createValidator();

        // Prepare a path to a source HTML file
        String documentPath = $i("test-checker.html");

        // Initialize an HTMLDocument object
        final HTMLDocument document = new HTMLDocument(documentPath);
        ValidationResult result = validator.validate(document);

        // Checking for success
        if (!result.getSuccess()) {
            for (RuleValidationResult detail : result.getDetails()) {
                // ... do the analysis here...
                System.out.println(String.format("%s: %s = %s",
                        detail.getRule().getCode(),
                        detail.getRule().getDescription(),
                        detail.getSuccess()
                ));
            }
        }
        // @END_SNIPPET WebAccessibilityCheck
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Validate website")
    @org.junit.jupiter.api.Tag("remote")
    public final void validateWebsiteTest() {
        // @START_SNIPPET Example_CheckWebsiteAccessibility.java
        // Check website for WCAG compliance in Java
        // Learn more: https://docs.aspose.com/html/java/web-accessibility-check/

        // Initialize webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Create an accessibility validator with static instance
        // for all rules from repository that match the builder settings
        AccessibilityValidator validator = webAccessibility.createValidator(ValidationBuilder.getAll());

        // Initialize an HTMLDocument object
        final HTMLDocument document = new HTMLDocument("https://products.aspose.com/html/net/generators/video/");
        ValidationResult validationResult = validator.validate(document);

        // Checking for success
        if (!validationResult.getSuccess()) {
            // Get a list of Details
            for (RuleValidationResult detail : validationResult.getDetails()) {
                System.out.println(String.format("%s: %s = %s",
                        detail.getRule().getCode(),
                        detail.getRule().getDescription(),
                        detail.getSuccess()
                ));
            }
        }
        // @END_SNIPPET  ValidateWebsite
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Check Alternative Text")
    public final void checkAltTextTest() {
        // @START_SNIPPET Example_CheckAltText.java
        // Validate HTML image alt text accessibility with detailed error reporting
        // Learn more: https://docs.aspose.com/html/java/screen-reader-accessibility/

        // Prepare a path to a source HTML file
        String documentPath = $i("alt-tag.html");

        // Initialize webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Get from the rules list Principle "1. Perceivable"
        // by code "1" and get guideline "1.1 Text Alternatives"
        Guideline guideline = webAccessibility.getRules()
                .getPrinciple("1").getGuideline("1.1");

        // Create an accessibility validator - pass the found guideline
        // as parameters and specify the full validation settings
        AccessibilityValidator validator = webAccessibility.createValidator(
                guideline,
                ValidationBuilder.getAll()
        );

        // Initialize an HTMLDocument object
        final HTMLDocument document = new HTMLDocument(documentPath);
        ValidationResult validationResult = validator.validate(document);

        if (!validationResult.getSuccess()) {
            // Get all the result details
            for (RuleValidationResult ruleResult : validationResult.getDetails()) {
                // If the result of the rule is unsuccessful
                if (!ruleResult.getSuccess()) {
                    // Get an errors list
                    for (ITechniqueResult result : ruleResult.getErrors()) {
                        // Check the type of the erroneous element, in this case,
                        // we have an error in the HTML Element
                        if (result.getError().getTarget().getTargetType() == TargetTypes.HTMLElement) {
                            HTMLElement rule = (HTMLElement) result.getError().getTarget().getItem();

                            System.out.println(String.format("Error in rule %s : %s",
                                    result.getRule().getCode(),
                                    result.getError().getErrorMessage()
                            ));

                            System.out.println(String.format("HTML Element: %s",
                                    rule.getOuterHTML()
                            ));
                        }
                    }
                }
            }
        }
        // @END_SNIPPET CheckAltText
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Validate Multimedia")
    @org.junit.jupiter.api.Tag("remote")
    public final void validateMultimediaTest() {
        // @START_SNIPPET Example_CheckMultimediaAccessibility.java
        // Validate HTML for multimedia accessibility using Java
        // Learn more: https://docs.aspose.com/html/java/screen-reader-accessibility/

        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Get from the rules list Principle "1.Perceivable" by code "1"
        // and get guideline "1.2 Time-based Media"
        Guideline guideline = webAccessibility.getRules()
                .getPrinciple("1").getGuideline("1.2");

        // Create an accessibility validator, pass the found guideline
        // as parameters, and specify the full validation settings
        AccessibilityValidator validator = webAccessibility.createValidator(
                guideline,
                ValidationBuilder.getAll()
        );

        // Initialize an HTMLDocument object
        final HTMLDocument document = new HTMLDocument("https://www.youtube.com/watch?v=Yugq1KyZCI0");
        ValidationResult validationResult = validator.validate(document);

        // Checking for success
        if (!validationResult.getSuccess()) {
            // Get all result details
            for (RuleValidationResult ruleResult : validationResult.getDetails()) {
                // If the result of the rule is unsuccessful
                if (!ruleResult.getSuccess()) {
                    // Get an errors list
                    for (ITechniqueResult result : ruleResult.getErrors()) {
                        // Check the type of the erroneous element
                        if (result.getError().getTarget().getTargetType() == TargetTypes.HTMLElement) {
                            HTMLElement rule = (HTMLElement) result.getError().getTarget().getItem();

                            System.out.println(String.format("Error in rule %s : %s",
                                    result.getRule().getCode(),
                                    result.getError().getErrorMessage()
                            ));

                            System.out.println(String.format("HTML Element: %s",
                                    rule.getOuterHTML()
                            ));
                        }
                    }
                }
            }
        }
        // @END_SNIPPET ValidateMultimedia
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Errors")
    public final void errorsTest() {
        // @START_SNIPPET Example_CheckWebAccessibilityWithCompleteErrorDetails.java
        // Check HTML for WCAG compliance and output failed rule codes and error messages
        // Learn more: https://docs.aspose.com/html/java/web-accessibility-check/

        // Initialize a webAccessibility container
        WebAccessibility webAccessibility = new WebAccessibility();

        // Create an accessibility validator with static instance
        // for all rules from repository that match the builder settings
        AccessibilityValidator validator = webAccessibility.createValidator(ValidationBuilder.getAll());

        String documentPath = $i("input.html");

        // Initialize an object of the HTMLDocument class
        final HTMLDocument document = new HTMLDocument(documentPath);
        ValidationResult validationResult = validator.validate(document);

        for (RuleValidationResult ruleResult : validationResult.getDetails()) {
            //  list only unsuccessful rule
            if (!ruleResult.getSuccess()) {
                // print the code and description of the rule
                System.out.println(String.format("%s: %s = %s",
                        ruleResult.getRule().getCode(),
                        ruleResult.getRule().getDescription(),
                        ruleResult.getSuccess()
                ));

                // print the results of methods with errors
                for (ITechniqueResult ruleDetail : ruleResult.getErrors()) {
                    // print the code and description of the method
                    StringBuilder str = new StringBuilder(String.format("\n{0}: {1} - {2}",
                            ruleDetail.getRule().getCode(),
                            ruleDetail.getSuccess(),
                            ruleDetail.getRule().getDescription()
                    ));
                    // get an error object
                    IError error = ruleDetail.getError();
                    // get a target object
                    Target target = error.getTarget();
                    // get error type and message
                    str.append(String.format("\n\n\t%s : %s",
                            error.getErrorTypeName(),
                            error.getErrorMessage()
                    ));

                    if (target != null) {
                        // Checking the type of the contained object for casting and working with it
                        if (target.getTargetType() == TargetTypes.CSSStyleRule) {
                            ICSSStyleRule cssRule = (ICSSStyleRule) target.getItem();
                            str.append(String.format("\n\n\t%s",
                                    cssRule.getCSSText()
                            ));
                        }
                        if (ruleDetail.getError().getTarget().getTargetType() == TargetTypes.CSSStyleSheet) {
                            str.append(String.format("\n\n\t%s",
                                    ((ICSSStyleSheet) target.getItem()).getTitle()
                            ));
                        }
                        if (ruleDetail.getError().getTarget().getTargetType() == TargetTypes.HTMLElement) {
                            str.append(String.format("\n\n\t%s",
                                    ((HTMLElement) target.getItem()).getOuterHTML()
                            ));
                        }
                    }
                    System.out.println(str);
                }
            }
        }
        // @END_SNIPPET Errors
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("SaveToString")
    public final void saveToStringTest() {
        // @START_SNIPPET Example_CheckWebAccessibilityAndSaveResultsToString.java
        // Validate HTML for accessibility in Java and export all errors and warnings as a string
        // Learn more: https://docs.aspose.com/html/java/web-accessibility-validation-results/

        String htmlPath = $i("input.html");

        final HTMLDocument document = new HTMLDocument(htmlPath);
        AccessibilityValidator validator = new WebAccessibility().createValidator();
        ValidationResult validationresult = validator.validate(document);

        // get rules errors in string format
        String content = validationresult.saveToString();

        // SaveToString - return only errors and warnings
        // if everything is ok, it will return "validationResult:true"
        System.out.println(content);
        // @END_SNIPPET SaveToString
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Save To JSON Format")
    public final void saveToJsonTest() throws IOException {
        String htmlPath = $i("input.html");
        String outputFile = $o("output.json");

        final HTMLDocument document = new HTMLDocument(htmlPath);
        AccessibilityValidator validator = new WebAccessibility().createValidator();
        ValidationResult validationresult = validator.validate(document);

        // create a StringWriter object
        final java.io.StringWriter sw = new java.io.StringWriter();
        if (!validationresult.getSuccess()) {
            // specify the format ValidationResultSaveFormat JSON or XML
            validationresult.saveTo(sw, ValidationResultSaveFormat.JSON);

            // after that you can save the string to a file
            try (java.io.FileWriter fileWriter = new java.io.FileWriter(outputFile);) {
                fileWriter.append(sw.toString());
            }
        }
        System.out.println(sw);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Save To XML Format")
    public final void saveToXmlTest()
            throws ParserConfigurationException, java.io.IOException, SAXException {
        // @START_SNIPPET Example_CheckWebAccessibilityAndOutputResultsToXml.java
        // Validate HTML for accessibility in Java and export all errors and warnings as an XML
        // Learn more: https://docs.aspose.com/html/java/web-accessibility-validation-results/

        String htmlPath = $i("input.html");

        final HTMLDocument document = new HTMLDocument(htmlPath);
        AccessibilityValidator validator = new WebAccessibility().createValidator();
        ValidationResult validationresult = validator.validate(document);

        final java.io.StringWriter sw = new java.io.StringWriter();
        validationresult.saveTo(sw, ValidationResultSaveFormat.XML);

        String xml = sw.toString();
        System.out.println(xml);

        DocumentBuilderFactory documentBuildFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuildFactory.newDocumentBuilder();
        documentBuilder.parse(new java.io.ByteArrayInputStream(xml.getBytes()));
        // @END_SNIPPET OutputToXML
    }
}