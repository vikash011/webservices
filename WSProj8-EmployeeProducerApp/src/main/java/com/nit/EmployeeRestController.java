package com.nit;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/emp")
public class EmployeeRestController {

	@GET
	@Path("/select")
	public String getEmployee() {
		return "Getting All Employees";
	}

	@POST
	@Path("/save")
	public String saveEmployee() {
		return "Employee updated";
	}

	@DELETE
	@Path("/delete")
	public String deleteEmploye() {
		return "Employee Deleted";
	}

	@PUT
	@Path("/modify")
	public String updateEmployee() {
		return "Emplyoee modified";
	}

}
