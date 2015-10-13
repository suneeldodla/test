package com.tesco.repository;

import java.util.List;

import com.tesco.model.Component;

public interface ComponentRepository {

	public abstract List<Component> findAllComponents();

	public  void create(Component component);

	

}