package com.nit.test;

import com.nit.comps.Outer01;

public class NestedInnerClassTest01 {

	public static void main(String[] args) {
		
//		creating object for Inner class
		Outer01.Inner in = new Outer01().new Inner();
		in.show();
		
		
	}

}
