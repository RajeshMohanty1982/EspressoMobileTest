# EspressoMobileTest
This project, Android app test is written in Java and uses Espresso to run instrumented tests.

 **Requirements**
1. Install Android Studio 4 or latest
2. Disable Animations within the Developer Options of your test device

 **Test Execution**
Run the tests from Terminal using following command: gradle connectedAndroidTest

 **Test Reports**
After executing tests, Reports will be generated ProjectRoot/app/build/reports/androidTests/connected/index.html
In this framework, android HTML report and Spoon report will also be generated. Jacoco is used for creating code coverage report.

**android HTML report:**

![](https://github.com/RajeshMohanty1982/EspressoMobileTest/blob/master/testersassessment-android/AndroidHTML.png)

**CodeCoverage Report:**

![](https://github.com/RajeshMohanty1982/EspressoMobileTest/blob/master/testersassessment-android/CodeCoverage.PNG)

**Spoon Screenshot**
Test screenshot will be captured using spoon client and image will be saved in Physical device(My Files/Internal storage/app_spoon-screenshots)

