package com.cricket.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cricket.model.Team;

@Path("/wc")
public class WorldCutService {

	@Path("/regiterForWorldCup")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registerTeam(Team team) {
		System.out.println(team.getCountry());
		System.out.println(team.getTotalMatches());
		System.out.println(team.getWins());
		System.out.println(team.getStatus());
		
		return Response.status(200).entity("Accepted").build();
	}
	
	@Path("/team/{teamName}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTeamDetail(@PathParam("teamName") String teamName) {
		//Hit database and get that team data
		System.out.println("Requested for " + teamName + " information!!");
		Team team = new Team();
		team.setCountry(teamName);
		team.setTotalMatches(456);
		team.setWins(350);
		team.setLoses(106);
		
		return Response.status(200).entity(team).build();
	}
}
