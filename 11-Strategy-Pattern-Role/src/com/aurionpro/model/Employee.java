package com.aurionpro.model;

public class Employee {
	
	private int id;
	private String name;
	private IRole role;
	
	public Employee(int id, String name, IRole role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	public void promote(IRole newRole) {
        this.role = newRole;
    }
    
    public String getDescription() {
        return role.description();
    }
    
    public String getResponsibility() {
        return role.responsibility();
    }

	public String getName() {
		
		return this.name;
	}

}