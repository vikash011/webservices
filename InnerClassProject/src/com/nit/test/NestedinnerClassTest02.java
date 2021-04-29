package com.nit.test;

import com.nit.comps.Outer02;

public class NestedinnerClassTest02 {

	public static void main(String[] args) {

//		creating object for nested Inner class
		Outer02.Inner in = new Outer02().new Inner();

//		creating object for Outer class
		Outer02 out = new Outer02();

//		invoking outer class method
		out.display();

//		invoking inner class method
		in.show();
	}

}
