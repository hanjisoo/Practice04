package com.javaex.problem04;

public abstract class Bird {
	private String name;
	
	public void sing() {
		
	}
	public void fly() {
		
	}
	
	public Bird() {
	}

	public Bird(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showName() {
		System.out.println(name);
	}

}
