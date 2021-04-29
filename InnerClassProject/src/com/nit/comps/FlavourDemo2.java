package com.nit.comps;

interface Hello {
	public void show();
}

class FlavourDemo2 {

	static Hello hello = new Hello() {
		public void show() {
			System.out.println("i am in Anonymous Inner class");
		}
	};

	public static void main(String[] args) {
		hello.show();
	}

}
