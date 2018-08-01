package com.satheesh.repository;

import java.util.ArrayList;
import java.util.List;

import com.satheesh.model.Login;

public class HibernateLoginRepositoryImpl implements LoginRepository {

	
	public List<Login> findAll(){
			List<Login> log=new ArrayList<>();
		
		Login l = new Login();
		
		l.setUsername("satheesh");
		l.setPassword("kumar");
		
		log.add(l);
		
		return log;
	}
	
}
