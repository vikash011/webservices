//NestedInnerClass
package com.nit.comps;

public class Outer01 {

	public Outer01() {
		System.out.println("Outer.0-param constructor");
	}

// Simple nested inner class
	public class Inner {
		public Inner() {
			System.out.println("Inner.0-param constructor");
		}

		public void show() {
			System.out.println("In a nested class method");
		}
	}
}


