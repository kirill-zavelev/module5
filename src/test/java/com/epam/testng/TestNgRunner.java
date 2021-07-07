package com.epam.testng;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestNgRunner {

    private static final String TESTNG_XML_FILE_PATH = "src/test/resources/testng.xml";
    private static final String SUITE_NAME = "NegativeSuite";

    public static void main(String[] args) {

        TestNG testNG = new TestNG();

        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setName(SUITE_NAME);
        List<String> files = Collections.singletonList(TESTNG_XML_FILE_PATH);
        xmlSuite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(xmlSuite);
        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
