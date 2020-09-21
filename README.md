# EspressoMobileTest
This project, Android app test is written in Java and uses Espresso to run instrumented tests.

 **Requirements**
1. Install Android Studio 4 or newer
2. Disable Animations within the Developer Options for your test device

 **Test Execution**
Run the tests with flavor Uitests: gradle connectedUitestsDebugAndroidTest

 **Test Reports**
After executing tests, Reports will be generated ProjectRoot/app/build/reports/androidTests/connected/index.html
In this project framework, android HTML report and Spoon report will generate. Jacoco is used for creating code coverage report.
android HTML report:
![](image/androidHTML.png)
