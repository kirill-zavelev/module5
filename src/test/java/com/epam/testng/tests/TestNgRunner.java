package com.epam.testng.tests;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestNgRunner {
    public static void main(String[] args) {

        TestNG testNG = new TestNG();

        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setName("NegativeSuite");
        List<String> files = new ArrayList<String>();
        files.addAll(new ArrayList<String>() {{
            add("/Users/kirill/Documents/module5/src/test/java/testng.xml");
        }});
        xmlSuite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(xmlSuite);
        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
