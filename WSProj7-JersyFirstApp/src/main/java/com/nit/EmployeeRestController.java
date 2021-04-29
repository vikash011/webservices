package com.nit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/emp")
public class EmployeeRestController {

	@GET
	@Path("/msg")
	public String showMessage(@QueryParam(value = "name") String name, @QueryParam(value = "age") int age) {
		return "Welcome To  ReSTful WebServices "+name+" having age "+age;
	}

}
