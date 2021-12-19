package executor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.ITestNGListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.internal.PackageUtils;

public class TestExecutor {
	public static void main(String[] args) {
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
}
