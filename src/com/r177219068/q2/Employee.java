package com.r177219068.q2;


public class Employee extends Department {
	int id;
	String name;
	Department dep;
	
	 public String getName()
	{
		return name;
		
	}
	
	 public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public void setName(String name)
	 {
		 this.name = name;
	 }
	 
	 public void setId(int id)
	 {
		 this.id = id;
	 }
	 
	 public void print()
	 {
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(depName);
	 }
	
	
}
