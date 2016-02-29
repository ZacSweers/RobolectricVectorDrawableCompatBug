package io.sweers.vectordrawablesadness;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(
        sdk = 16,
        constants = BuildConfig.class,
        packageName = BuildConfig.APPLICATION_ID
)
public class ExampleUnitTest {

    @Test
    public void toolbarSadness() throws Exception {
        // Shows it happens on inflation of AppCompat widgets
        OtherActivity otherActivity = Robolectric.setupActivity(OtherActivity.class);
        Assert.assertTrue(true);
    }

    @Test
    public void mainActivity() throws Exception {
        // Shows it also happens when manually calling VectorDrawableCompat.create()
        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);
        Assert.assertTrue(true);
    }
}
