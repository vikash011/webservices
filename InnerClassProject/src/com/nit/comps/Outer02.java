package com.nit.comps;

public class Outer02 {

	public Outer02() {
		System.out.println("Outer02.0-parm constructor");
	}

	public void display() {
		System.out.println("Outer class method");
	}

//	simple nested inner class
	public class Inner {

		public Inner() {
			System.out.println("Inner.0-param constructor");
		}

		public void show() {
			System.out.println("Inner class method");
		}
	}
}
