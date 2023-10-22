package com.infinite.SpringbootExample.repository;

import java.util.List;

import com.infinite.SpringbootExample.Entity.Logindata;

public interface DaoforLogin {
	public List<Logindata> getAllCustomers();
	public void toinsert(Logindata logindata);
}
