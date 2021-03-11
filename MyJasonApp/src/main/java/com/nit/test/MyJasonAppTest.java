package com.nit.test;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nit.model.Employee;
import com.nit.model.Student;

public class MyJasonAppTest {

	public static void main(String[] args) {

		try {

//			creating Student class object
			Student s1 = new Student();
			s1.setSId(1001);
			s1.setSName("vikash");
			s1.setSFee(5098.03);

//			creating objectMapper class object
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(s1);

//			printing json data
			System.out.println(json);

			om.writeValue(new File("C:/vikash/logs/student.json"), s1);
			System.out.println("done");

			System.out.println("-------------------------------------------------------------------");

//            creating Employee object
			Employee emp = new Employee();
			emp.setEmpID(101);
			emp.setEmpName("raja");
			emp.setEmpSal(88787.988);

			String eJson = om.writeValueAsString(emp);
			System.out.println(eJson);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
