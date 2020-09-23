package com.abnamro.apps.referenceandroid;

import android.content.res.Resources;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public abstract class TestBase {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<>(MainActivity.class);
    public static MainActivity mainActivity = null;
    public Resources resources;

    @Before
    public void init(){
        mainActivity = mainActivityRule.getActivity();
        resources = mainActivity.getResources();
    }
}
