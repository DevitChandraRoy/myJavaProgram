package main;

import java.util.jar.Attributes.Name;

public class NumericTestRun {
	public static void main(String args[]) {
		NumericTest isEven = (n) -> (n % 2) == 0;
		NumericTest isOdd = (n) -> (n % 2) == 1;
		System.out.println(isEven.computeTest(5));
		System.out.println(isOdd.computeTest(5));

		Greater hw = (name) -> "Hello " + name;
		System.out.println(hw.greating("DEVIT"));
	}
}
