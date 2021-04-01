package com.nit;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

public class JerseyClintAppTest {

	private static final String uri = "http://localhost:8080/WSProj7-JersyFirstApp/";
	private static final String path = "/rest/emp/select";

	public static void main(String[] args) {

		try {

//	     	creating Empty Client object
			Client c = ClientBuilder.newClient();

//			adding URI and Path to WebTarget
			WebTarget wt = c.target(uri).path(path);

//		convert to request RequestBuiler object
			Invocation.Builder builder = wt.request();

//		    provide Header, body
//		    nothing as now

//		    execute the type(get()/post() mode)

//		    read response from Front Controller
			Response response = builder.get();

//		    read details and print details

			System.out.println("Response class name:" + response.getClass().getName());
			System.out.println("Response status:" + response.getStatus());
			System.out.println("Response readEntity:" + response.readEntity(String.class));
			System.out.println("Response status info:" + response.getStatusInfo());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
