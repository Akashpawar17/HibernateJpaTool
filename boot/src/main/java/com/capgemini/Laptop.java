package com.capgemini;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private int lid;
	private String lname;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	public void compile()
	
	{
		System.out.println("compiler");
	}

}
