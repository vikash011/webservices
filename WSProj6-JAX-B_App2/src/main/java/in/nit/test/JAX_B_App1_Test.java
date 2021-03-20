package in.nit.test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import in.nit.model.Employee;

public class JAX_B_App1_Test {

	public static void main(String[] args) {

//		creating List for Projects
		List<String> proj = new ArrayList<>();
		proj.add("Tata");
		proj.add("Mahindra");
		proj.add("Eicher");
		proj.add("Hitachi");

//	   creating HashSet for MobNo

		Set<Long> mob = new HashSet<>();
		mob.add(999999999l);
		mob.add(888888888l);
		mob.add(777777777l);
		mob.add(666666666l);

//	   creating Map for Versions
		Map<String,Double> ver = new HashMap<>();
		ver.put("project", 1.0);
		ver.put("project", 2.0);
		ver.put("project", 3.0);
	

//		 creating Employee class Object
		Employee emp = new Employee();
		emp.seteId(1010);
		emp.seteName("King");
		emp.seteSal(67676.982);
		emp.setDept("clerk");
		emp.setProjects(proj);
		emp.setMobileNo(mob);
		emp.setVersions(ver);

//		creating JAX-BContext Object
		try {

//			creating JAXBContext Object for Employee  class
			JAXBContext context = JAXBContext.newInstance(Employee.class);

//			creating Marshaller object
			System.out.println("creating Marshalling");
			Marshaller m = context.createMarshaller();
			System.out.println(m.getClass().getName());
			m.marshal(emp, new File("C:/Vikash/logs/employee.xml"));

			System.out.println("Done");

			System.out.println("-----------------------------------------------------");

//			creating Object for UnMarshaller
			Unmarshaller um = context.createUnmarshaller();
			Employee emp2 = (Employee) um.unmarshal(new File("C:/Vikash/logs/employee.xml"));

			System.out.println(emp2);
			

		} catch (JAXBException e) {

			e.printStackTrace();
		}

	}

}
