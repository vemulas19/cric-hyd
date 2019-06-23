package com.cricket.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/ipl")
public class IplService {

	@Path("/testCon")
	@GET
	public Response testConnection() {

		String output = "Connection successfull!!";
		System.out.println("connection triggered!!");
		return Response.status(201).entity(output).build();
	}

	@Path("/wishUser")
	@GET
	public Response sayHelo(@QueryParam("name") String userName) {

		System.out.println("User is : " + userName);
		String output = "Helo : " + userName;
		return Response.status(200).entity(output).build();
	}

	@Path("/greetUser/{userName}/{age}/{industry}")
	@GET
	public Response sayHeloPath(@PathParam("userName") String name, @PathParam("age") String age,
			@PathParam("industry") String indus) {

		System.out.println("User is : " + name + "--" + age + "--" + indus);
		String output = "Helo : " + name+ "--" + age + "--" + indus;
		return Response.status(200).entity(output).build();
	}

}
