package com.infinite.SpringbootExample.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infinite.SpringbootExample.Entity.Logindata;
import com.infinite.SpringbootExample.service.Serviceimpls;

@Repository
public class DaoImpls implements DaoforLogin {
	private static final Logger logger = Logger.getLogger(DaoImpls.class);
	@Autowired
	SessionFactory sfactory;

	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	@Override
	public void toinsert(Logindata logindata) {
		// TODO Auto-generated method stub
		Session session = this.sfactory.getCurrentSession();
		session.save(logindata);
	}

	@Override
	public List<Logindata> getAllCustomers() {
		// TODO Auto-generated method stub
		Session session = this.sfactory.getCurrentSession();
		List<Logindata> ls = session.createQuery("from Logindata").list();
		return ls;
	}

}
