package coretest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.ITestNGListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.internal.PackageUtils;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;


public class TestExecutorMain {
	public static void main(String[] args) {
		new TestExecutorMain().runClasses();
		
	}

	private void runClasses() {
		List<Class<?>> classesToRun = new ArrayList<Class<?>>();
		try {
			String[] classes = PackageUtils.findClassesInPackage("tests",
					Collections.emptyList(), Collections.emptyList());
			for (String klasaTestowa : classes) {
				System.out.println(klasaTestowa);
				classesToRun.add(Class.forName(klasaTestowa));
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		TestNG tng = new TestNG();
		TestListenerAdapter tla = new TestListenerAdapter();
		tng.addListener((ITestNGListener)tla);
		tng.setTestClasses(classesToRun.toArray(new Class[0]));
		tng.run();
	}

	private void runXmls() {
		XmlSuite suite = new XmlSuite();
		suite.setName("TmpSuite");
		 
		XmlTest test = new XmlTest(suite);
		test.setName("TmpTest");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		String[] testNames;
		try {
			 testNames = PackageUtils.findClassesInPackage("tests", Collections.emptyList(), Collections.emptyList());
			 for(String testName:testNames) {
				 classes.add(new XmlClass(testName));
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.setXmlClasses(classes) ;
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();


	}

}
