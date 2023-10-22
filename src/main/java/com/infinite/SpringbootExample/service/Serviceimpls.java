package com.infinite.SpringbootExample.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infinite.SpringbootExample.Entity.Logindata;
import com.infinite.SpringbootExample.repository.DaoImpls;
@Service
public class Serviceimpls implements LoginService{
	private static final Logger logger = Logger.getLogger(Serviceimpls.class);
	@Autowired DaoImpls daoImpls;

	@Transactional
	public void toinsert(Logindata logindata) {
		// TODO Auto-generated method stub
		daoImpls.toinsert(logindata);
	}
	
	@Transactional
	public List<Logindata> getAllCustomers() {
		// TODO Auto-generated method stub
		return daoImpls.getAllCustomers();
	}

}
