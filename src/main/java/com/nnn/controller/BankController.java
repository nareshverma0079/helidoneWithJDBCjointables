package com.nnn.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nnn.model.BankDetails;
import com.nnn.repository.BankRepo;

@Path("/bank")
@RequestScoped
public class BankController {

	@Inject
	BankRepo repo;
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public BankDetails getBankDetails(@PathParam("id") int id) {
		return repo.getbankdetails(id);
	}
}
