package com.infinite.SpringbootExample.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.SpringbootExample.Entity.Logindata;
import com.infinite.SpringbootExample.service.Serviceimpls;

@Controller
public class MyController {
	private static final Logger logger = Logger.getLogger(MyController.class);
	@Autowired
	Serviceimpls si;

	@RequestMapping(value = "/getAllCustomers", method = RequestMethod.GET)
	public String getAllCustomers(Model model) {
		model.addAttribute("logindata", new Logindata());
		//model.addAttribute("listOfCustomers", si.getAllCustomers());
		return "loginpage";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllCustomers";
	}
	@RequestMapping(value = "/getlogin", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addData(@Valid @ModelAttribute("logindata") Logindata logindata, BindingResult result) {
		if (result.hasErrors()) {
			logger.info(result);
			return "loginpage";
		} else if (logindata.getId() == 0) {
			si.toinsert(logindata);
		}
		return "success";
	}
}
