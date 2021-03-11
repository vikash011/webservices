package com.nit.model;

public class Student {

	private int SId;
	private String SName;
	private double SFee;

	public Student() {
		System.out.println("Student.0-param constuctor");
	}

	public Student(int sId, String sName, double sFee) {
		System.out.println("Student.all aparam constructor");
		SId = sId;
		SName = sName;
		SFee = sFee;
	}

	public int getSId() {
		return SId;
	}

	public void setSId(int sId) {
		SId = sId;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public double getSFee() {
		return SFee;
	}

	public void setSFee(double sFee) {
		SFee = sFee;
	}

	@Override
	public String toString() {
		return "Student [SId=" + SId + ", SName=" + SName + ", SFee=" + SFee + "]";
	}

}
