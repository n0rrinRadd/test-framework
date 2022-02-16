# test-framework

## Run Tests

### IntelliJ

* Navigate to `/src/test/java/*` or `/src/test/java/tests/*`
* Select the test you want to run either in the project window OR test class
    * Right click and select
        * `Run'test_name'` OR
        * `Debug'test_name'`
    * Use the keyboard shortcut
        * `^+Shift+R` to run
        * `^+Shift+D` to debug

### Command Line

In terminal, navigate to project root and type

**note this will run all Test functions with the `@Test` tag**

To run tests
 ```
 ./gradlew clean test 
```

## View Test Output

* Open browser
* Select Open File
* Open file `test-framework/build/reports/tests/test/index.html`
* Review Test Summary

## Known Problems

The Wordle game uses shadow-root which is a new dom latest Chrome version 96 supports that would have broken this test framework if the current test framework/tests were developed prior to this update

### Solution

Understand shadow-root more and update to Selenium 4, see [here](https://github.com/SeleniumHQ/selenium/issues/10050)

## Improvements

* DriverFactory to allow browser instanciate abstraction
* SeleniumGrid integration to allow tests to run in parallel
* SearchContext element implentation to address shadow-root (see solutions)
* Test annotation grouping to run tests in command line as a group
* Integrate Gherkin/Cucumber framework in `/main` to allow test writting in given/when/then constructs
* Move Objects `src/test/java/objects` into `/src/main` to integrate with Gherkin/Cucmber
* Add log4j to address logging capabilities
* Add softAssertion depedency to handle multiple assertions such as tests: `testGameBoardExistsAndRowsAndColumns` and `testInvalidWordValidationMessage`