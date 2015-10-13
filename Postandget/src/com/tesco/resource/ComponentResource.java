package com.tesco.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.tesco.model.Component;
import com.tesco.repository.ComponentRepository;
import com.tesco.repository.RepositoryStub;

@Path("components")
public class ComponentResource {
	
	private ComponentRepository componentrepository = new RepositoryStub();
	
	
	/*@POST
	@Path("addcomponent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Component createComponent(Component component){
		
		componentrepository.create(component);
		
		return component;
	}*/
	
	@POST
	@Path("addcomponent")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Component createActivityParams(MultivaluedMap<String, String> formParams){
		
		Component component = new Component();
		component.setId(Integer.parseInt(formParams.getFirst("id")));
		component.setName(formParams.getFirst("name"));
		component.setLocation(formParams.getFirst("location"));
		
		System.out.println(formParams.getFirst("id"));
		System.out.println(formParams.getFirst("name"));
	    System.out.println(formParams.getFirst("location"));
		
	    componentrepository.create(component);
		
		return null;
		
	}
	
	@GET
	@Path("getcomponents")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Component> getAllComponents(){
		
		return componentrepository.findAllComponents();
	}
		
	
	  
}
