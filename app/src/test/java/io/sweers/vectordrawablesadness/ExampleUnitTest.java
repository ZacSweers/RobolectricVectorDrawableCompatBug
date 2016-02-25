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

    private final OtherActivity otherActivity = Robolectric.setupActivity(OtherActivity.class);

    @Test
    public void toolbarSadness() throws Exception {
        Assert.assertTrue(true);
    }
}
