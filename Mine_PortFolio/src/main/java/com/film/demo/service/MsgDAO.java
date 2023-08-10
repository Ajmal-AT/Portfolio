package com.film.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.film.demo.beans.MsgBean;

@Component
public class MsgDAO {
	
	@Autowired
	private msgRepo msgrepo;
	
	public int save(MsgBean msg) {
		msgrepo.save(msg);
		return 1;
	}
}
