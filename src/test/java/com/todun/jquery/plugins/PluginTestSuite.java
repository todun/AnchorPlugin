package com.todun.jquery.plugins;

import junit.framework.Test;
import junit.framework.TestSuite;

public class PluginTestSuite {

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(LocalResourceTest.class);
        suite.addTestSuite(HostedResourceTest.class);
        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}
