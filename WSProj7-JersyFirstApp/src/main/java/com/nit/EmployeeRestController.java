package com.nit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/emp")
public class EmployeeRestController {

	@GET
	@Path("/msg")
	public String showMessage() {
		return "Welcome To  ReSTful WebServices";
	}

}
