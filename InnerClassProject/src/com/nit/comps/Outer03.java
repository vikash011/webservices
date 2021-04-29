//Method Local Inner class

package com.nit.comps;

public class Outer03 {
	
	public Outer03() {
		System.out.println("Outer.0-param constrcutor");
	}

	public void OuterMethod() {
		System.out.println(" In OuterMethod");

		class Inner {
			public Inner() {
				System.out.println("Inner.0-param constructor");
			}

			void innerMethod() {
				System.out.println("In Inner Method");
			}

		}
		Inner in = new Inner();
		in.innerMethod();

	}

}
