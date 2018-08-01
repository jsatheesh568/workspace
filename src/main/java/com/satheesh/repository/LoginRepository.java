package com.satheesh.repository;

import java.util.List;

import com.satheesh.model.Login;

public interface LoginRepository {
	List<Login> findAll();
}