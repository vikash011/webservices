package in.nit.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

	@XmlAttribute // creates member variable as Xml Attribute
	private Integer eId;
	@XmlElement(name = "Emp-Name") // creates member variable as Xml Element
	private String eName;
	@XmlTransient // use for hiding data
	private Double eSal;
	@XmlElement(name = "Emp-Dept")
	private String dept;

	
	@XmlElementWrapper(name="projects")
	private List<String> projects;
	@XmlElementWrapper(name="MobileNo")
	private Set<Long> mobileNo;
	private Map<String, Double> versions;

	public Employee() {
		System.out.println("Employee.0-param constructor");
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public Set<Long> getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Set<Long> mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Map<String, Double> getVersions() {
		return versions;
	}

	public void setVersions(Map<String, Double> versions) {
		this.versions = versions;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", dept=" + dept + ", projects="
				+ projects + ", mobileNo=" + mobileNo + ", versions=" + versions + "]";
	}

}
