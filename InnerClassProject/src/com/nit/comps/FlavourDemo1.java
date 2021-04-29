package com.nit.comps;

class Demo {
	public void show() {
		System.out.println("i am in super class (Demo) show()");
	}
}

public class FlavourDemo1 {

	static Demo d = new Demo() {

		public void show() {
			System.out.println("i am in sub class (FlavourDemo1) show()");
		}
	};

	public void main(String[] args) {
		d.show();

	}

}
