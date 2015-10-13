package com.tesco.repository;

import java.util.ArrayList;
import java.util.List;

import com.tesco.model.Component;

public class RepositoryStub implements ComponentRepository {
	
	
	@Override
	public void create(Component component) {
		
		
		
	}
	
	public List<Component> findAllComponents() {
		
		List<Component> components = new ArrayList<Component>();
		
		Component component1 = new Component();
		component1.setId(1);
		component1.setName("ApplicationHeader");
		component1.setLocation("http://ukird515.dev.global.tesco.org:8086/groceries/components/ApplicationHeader.js");
		components.add(component1);
		Component component2 = new Component();
		component2.setId(2);
		component2.setName("Carousel");
		component2.setLocation("http: //ukird515.dev.global.tesco.org: 8086/groceries/components/Carousel.js");
		components.add(component2);
		Component component3 = new Component();
		component3.setId(3);
		component3.setName("PageFooter");
		component3.setLocation("http: //ukird515.dev.global.tesco.org: 8086/groceries/components/PageFooter.js");
		components.add(component3);
		
		
		return components;
		
		
	}

	

	

	

}
