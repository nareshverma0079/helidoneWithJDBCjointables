package com.nnn.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nnn.model.Department;
import com.nnn.repository.DeptRepo;

@Path("/department")
@RequestScoped
public class DeptController {

	@Inject
	DeptRepo repo;
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Department getDepartment(@PathParam(value = "id") int id) {
		return repo.getdept(id);
	}
	
	
	
}
