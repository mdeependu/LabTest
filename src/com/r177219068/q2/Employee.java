package com.r177219068.q2;

public class Employee extends Department implements Cloneable{
	
	int id;
	String name;
	Department dep;
	
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public Department getDepartment() 
	{
		return dep;
	}
	
	public void setDepartment(Department department) 
	{
		dep = department;
	}
	
	Employee(){
		
		System.out.println("Object of Class Employee created");
		
	}
	
	void disp() {
		
		System.out.println("Name : "+name);
		System.out.println("Id   : "+id);
		System.out.println("Dep  : "+departmentName);
		
		
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException 
	{
		return (Employee) super.clone();
	}
	
	
	
	
	

}