package com.infinite.SpringbootExample.service;

import java.util.List;

import com.infinite.SpringbootExample.Entity.Logindata;

public interface LoginService {
	public List<Logindata> getAllCustomers();

	public void toinsert(Logindata logindata);
}
