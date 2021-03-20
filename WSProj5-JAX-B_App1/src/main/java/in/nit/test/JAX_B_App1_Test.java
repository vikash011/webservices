package in.nit.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import in.nit.model.Employee;

public class JAX_B_App1_Test {

	public static void main(String[] args) {

//		 creating Employee class Object
		Employee emp = new Employee();
		emp.seteId(1010);
		emp.seteName("King");
		emp.seteSal(67676.982);
		emp.setDept("clerk");

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
