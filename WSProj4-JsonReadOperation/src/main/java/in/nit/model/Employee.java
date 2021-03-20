package in.nit.model;

import java.util.List;
import java.util.Map;

public class Employee {

	private Integer eId;
	private String eName;
	private Double eSal;
	private Address address;
	private List<String> projects;
	private Map<String,Double> versions;

	public Employee() {
		System.out.println("Employee.0-parma constructor");
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Double geteSal() {
		return eSal;
	}

	public void seteSal(Double eSal) {
		this.eSal = eSal;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public Map<String, Double> getVersions() {
		return versions;
	}

	public void setVersions(Map<String, Double> versions) {
		this.versions = versions;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", address=" + address + ", projects="
				+ projects + ", versions=" + versions + "]";
	}

}
