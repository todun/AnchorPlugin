package com.todun.jquery.plugins;


import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * Test for resource located on file system
 */
public class LocalResourceTest extends AbstractPluginTest {

    /**
     * Setup for resource located on file system
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        port = "";
        resourceProtocol = "file:///";
        resourcePath = platformAgnosticFilePath(".", "web", "index.html");

        baseUrl = buildBaseUri(resourceProtocol, resourcePath, port, true);

        super.setUp();
    }

    @Test
    public void testPluginTestCase() throws Exception {
        clickDifferentLinksScenarioTestCase();
    }

    /**
     * Helper method to determine the file path on any platform
     *
     * @param pwd present working directory
     * @param resourceDirectory directory where resource is located
     * @param resourceName name of resource
     * @return filepath to resource
     */
    private String platformAgnosticFilePath(String pwd, String resourceDirectory, String resourceName) {
        String pathname = new File(pwd).toURI().getPath();
        StringBuilder filepath = new StringBuilder();
        filepath.append(pathname).append(resourceDirectory).append(File.separatorChar).append(resourceName);
        return filepath.toString();
    }
}
