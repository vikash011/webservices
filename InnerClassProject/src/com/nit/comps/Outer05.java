package com.nit.comps;

public class Outer05 {

	public Outer05() {
		System.out.println("Outer.0-param constructor");
	}

	public static void OuterMethod() {
		System.out.println("In Outer Method");
	}

	static class Inner {

		public static void main(String[] args) {

			System.out.println("Inside Inner class ");
			OuterMethod();
		}

	}
}
