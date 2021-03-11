package in.nit.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int empId;
	private String empName;
	private double empsal;
	private List<String> empModules;
	private Set<String> projects;
	private Map<String, Integer> versions;
	private Address addrs;

	public Employee() {
		System.out.println("Employee.0-param constructor");
	}

	public Employee(int empId, String empName, double empsal, List<String> empModules, Set<String> projects,
			Map<String, Integer> versions) {
		this.empId = empId;
		this.empName = empName;
		this.empsal = empsal;
		this.empModules = empModules;
		this.projects = projects;
		this.versions = versions;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}

	public List<String> getEmpModules() {
		return empModules;
	}

	public void setEmpModules(List<String> empModules) {
		this.empModules = empModules;
	}

	public Set<String> getProjects() {
		return projects;
	}

	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}

	public Map<String, Integer> getVersions() {
		return versions;
	}

	public void setVersions(Map<String, Integer> versions) {
		this.versions = versions;
	}

	public Address getAddrs() {
		return addrs;
	}

	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empsal=" + empsal + ", empModules=" + empModules
				+ ", projects=" + projects + ", versions=" + versions + ", addrs=" + addrs + "]";
	}

}
