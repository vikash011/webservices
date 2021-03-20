package in.nit.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.nit.model.Employee;

public class JsonReadOperationTest {

	public static void main(String[] args) throws JsonProcessingException {

		/*
		 * // creating Employee Object class Employee emp = new Employee();
		 * emp.seteId(101); emp.seteName("king"); emp.seteSal(45454.76);
		 */

//		creating Json String
		String json = "{\"eId\":100,\"eName\":\"king\",\"eSal\":6565.867}";
		// String json = "{}"; valid json

//		creating ObjectMapper class object
		ObjectMapper om = new ObjectMapper();

		try {
			Employee emp = om.readValue(json, Employee.class);
//             printing Employee object data
			System.out.println(emp);
			System.out.println("-------------------------------------------------");

			Employee emp1 = om.readValue(new File("C:/Vikash/logs/employee.json"), Employee.class);
			System.out.println("read json sucessfully");
			System.out.println(emp1);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
