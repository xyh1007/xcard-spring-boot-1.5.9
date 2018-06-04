package com.xyh.game.req;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class TestReq implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3377447825007230381L;
	@NotNull(message = "{valid.test.name.null}")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
