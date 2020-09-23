package com.abnamro.apps.referenceandroid.TestingTask;

import android.Manifest;

import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.GrantPermissionRule;

import com.abnamro.apps.referenceandroid.R;
import com.abnamro.apps.referenceandroid.TestBase;
import com.squareup.spoon.Spoon;

import org.junit.Rule;
import org.junit.Test;

import static android.app.PendingIntent.getActivity;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
//import static com.google.android.material.internal.ContextUtils.getActivity;
import static org.hamcrest.Matchers.allOf;

public class MainActivityTest extends TestBase {

    public static String settingsTxt = "Settings";
    public static String ApplicationName = "ReferenceAndroid";
    public static String AppBodyTxt = "Hello World!";
    public static String toastMessage = "Replace with your own action";
@Rule
public GrantPermissionRule mRuntimePermissionRule = GrantPermissionRule.grant(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE);

    @Test
    public void verifyMoreOptionsBtn(){
        // Make screenshot before performance
        Spoon.screenshot(mainActivity, "initial_state");
//        Find the element MoreOptions button to Click and verify.
        onView(withContentDescription("More options")).check(matches(isClickable())).perform(click());
        Spoon.screenshot(mainActivity, "state_changed");
        //Assert that Settings option is displayed when MoreOption is tapped.
        onView(allOf(withText("Settings"))).check(matches(withText(settingsTxt)));

    }

    @Test
    public void verifyAppicationTitle(){
        //Find the application title and verify
        onView(withText("ReferenceAndroid")).check(matches(withText(ApplicationName)));
        //Capture Screenshot after test execution
        Spoon.screenshot(mainActivity, "applicationTitle");
    }

    @Test
    public void verifyApplicationBodyText(){
        //Find the Body Text and verify
        onView(withText("Hello World!")).check(matches(withText(AppBodyTxt)));
        //Capture Screenshot after test execution
        Spoon.screenshot(mainActivity, "HelloWorld");
    }

    @Test
    public void clickOnEmailBtn(){
        //Find the Email Button and verify if button is clickable
        onView(ViewMatchers.withId(R.id.fab)).perform(click()).check(matches(isClickable()));
        Spoon.screenshot(mainActivity, "EmailButtoncClicked");
        //Assert the textmessage after clicking the Emailbutton
        onView(withText("Replace with your own action")).check(matches(withText(toastMessage)));

    }

}
