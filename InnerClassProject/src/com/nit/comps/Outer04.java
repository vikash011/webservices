//Method Local Inner class

package com.nit.comps;

public class Outer04 {
	
	public Outer04() {
		System.out.println("Outer.0-param constrcutor");
	}

	
	public void OuterMethod() {
		System.out.println(" In OuterMethod");
		 int x=92;
		

		class Inner {
			public Inner() {
				System.out.println("Inner.0-param constructor");
			}

			void innerMethod() {
				System.out.println("In Inner Method");
				System.out.println("x:"+x);
			}

		}
		Inner in = new Inner();
		in.innerMethod();

	}

}
