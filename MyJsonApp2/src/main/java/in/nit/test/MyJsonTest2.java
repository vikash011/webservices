package in.nit.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.nit.model.Address;
import in.nit.model.Employee;

public class MyJsonTest2 {

	public static void main(String[] args) {

//		creating Address class object
		Address addrs = new Address();
		addrs.setHNO("11-k/45");
		addrs.setLoc("HYD-IND");

//		creating list object
		List<String> al = new ArrayList<>();
		al.add("M1");
		al.add("M2");
		al.add("M3");
		al.add("M4");

//		creating Set class object
		Set<String> hs = new HashSet<>();
		hs.add("p1");
		hs.add("p2");
		hs.add("p3");
		hs.add("p4");

//		creating Map class object
		Map<String, Integer> hm = new HashMap<>();
		hm.put("v1", 1);
		hm.put("v2", 2);
		hm.put("v3", 3);
		hm.put("v4", 4);

//		creating Employee Object
		Employee emp = new Employee();
		emp.setEmpId(10001);
		emp.setEmpName("vikash");
		emp.setEmpsal(32323.65);
		emp.setAddrs(addrs);
		emp.setProjects(hs);
		emp.setVersions(hm);
		emp.setEmpModules(al);

		System.out.println("java Object data");
		System.out.println(emp);

//		creating object of ObjectMapper
		ObjectMapper om = new ObjectMapper();
		try {
			String json = om.writeValueAsString(emp);
			
			System.out.println("_____________________________________________________________");
//			printing Json Data
			System.out.println(json);
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	

	}

}
