package org.dasein.cloud.test;

import org.dasein.cloud.test.cloud.StatelessAuthenticationTests;
import org.dasein.cloud.test.cloud.StatelessDCTests;
import org.dasein.cloud.test.compute.StatelessImageTests;
import org.dasein.cloud.test.compute.StatelessVMTests;
import org.dasein.cloud.test.compute.StatelessVolumeTests;
import org.dasein.cloud.test.identity.StatelessKeypairTests;
import org.dasein.cloud.test.network.StatelessFirewallTests;
import org.dasein.cloud.test.network.StatelessVLANTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * [Class Documentation]
 * <p>Created by George Reese: 2/17/13 8:12 PM</p>
 *
 * @author George Reese
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        StatelessAuthenticationTests.class,
        StatelessDCTests.class,
        StatelessVMTests.class,
        StatelessKeypairTests.class,
        StatelessImageTests.class,
        StatelessVolumeTests.class,
        StatelessVLANTests.class,
        StatelessFirewallTests.class
})
public class StatelessTestSuite {
}
