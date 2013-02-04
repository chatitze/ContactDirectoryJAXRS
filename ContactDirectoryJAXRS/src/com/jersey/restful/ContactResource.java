package com.jersey.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/contacts")
public class ContactResource {

	// Return contact details to the user in the browser
	  @GET @Path("{id}")
	  @Produces(MediaType.TEXT_XML)
	  public ContactDTO findByIdHTML(@PathParam("id") String id) {
		  ContactDAO dao = new ContactDAO();
		  return dao.findById(Long.parseLong(id));
	  }
	  
	// Return contact details for applications
	@GET @Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ContactDTO findById(@PathParam("id") String id) {
		ContactDAO dao = new ContactDAO();
		return dao.findById(Long.parseLong(id));
	}
	
}
