package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

public class AsyncTaskAndroidTest extends AndroidTestCase {

    public void testEndpointsAsyncTask() {
        try {
            String joke = new EndpointsAsyncTask(getContext()).execute().get();
            assertNotNull(joke);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public void testNonEmptyJoke() {
        try {
            String joke = new EndpointsAsyncTask(getContext()).execute().get();
            assertNotSame("", joke);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

}
