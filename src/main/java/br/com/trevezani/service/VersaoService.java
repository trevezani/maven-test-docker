package br.com.trevezani.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class VersaoService {
	
	@Path("/versao")
	@GET
	public String getVersao() {
		return "v1.00";
	}
	
}
