package com.todun.jquery.plugins;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * Test for resource located on file system
 */
public class LocalResourceTest extends AbstractBaseTest {

    /**
     * Setup for resource located on file system
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        port = "";
        resourceProtocol = "file:///";
        contextPath = ".";
        resourcePath = platformAgnosticFilePath(contextPath, RESOURCE_BASE_DIRECTORY, RESOURCE_FILE_NAME);

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
     * @param pwd               present working directory
     * @param resourceDirectory directory where resource is located
     * @param resourceName      name of resource
     * @return filepath to resource
     */
    private String platformAgnosticFilePath(String pwd, String resourceDirectory, String resourceName) {
        String pathname = new File(pwd).toURI().getPath();
        StringBuilder filepath = new StringBuilder();
        filepath.append(pathname).append(resourceDirectory).append(File.separatorChar).append(resourceName);
        return filepath.toString();
    }
}
