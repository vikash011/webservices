package in.nit.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

	@XmlAttribute                 //creates member variable as Xml Attribute
	private Integer eId;
	@XmlElement(name = "Emp-Name")    //creates member variable as Xml Element
	private String eName;
	@XmlTransient             //use for hiding data
	private Double eSal;
	@XmlElement(name = "Emp-Dept")
	private String dept;

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

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", dept=" + dept + "]";
	}

}
