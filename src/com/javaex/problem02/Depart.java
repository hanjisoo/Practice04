package com.javaex.problem02;

public class Depart extends Employee {
	
	private String department;
	
	public Depart() {
		
	}
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department=department;
	}
	public void getInformation() {
		System.out.println("이름:"+ setName +"연봉:"+ setSalary +"부서:"+department);
	}
    //코드작성

}
