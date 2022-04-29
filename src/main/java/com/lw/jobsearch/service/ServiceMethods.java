package com.lw.jobsearch.service;

import java.util.List;

public interface ServiceMethods <T>{
	
	//create
		T create(T job);
		
		//readAll
		List<T> readAll();
		
		//readById
		T readById(long id);
		
		//update
		T update(long id, T job);
		
		//delete
		boolean delete(long id);

}
