package com.satheesh.service;

import java.util.List;

import com.satheesh.model.Login;
import com.satheesh.repository.LoginRepository;

public class LoginServiceImpl implements LoginService {

	private LoginRepository loginRepository;
	
	/* (non-Javadoc)
	 * @see com.satheesh.service.LoginService#findAll()
	 */
	@Override
	public List<Login> findAll()
	{
		return loginRepository.findAll();
	}

	public void setLoginRepository(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}
}
