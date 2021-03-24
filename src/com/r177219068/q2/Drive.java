package com.r177219068.q2;

public class Drive {

		public static void main(String[] args) throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			
			Employee e1 = new Employee();
			e1.setName("Mandal");
			e1.setId(68);
			e1.setDepartment(e1);
			e1.disp();
			
			Employee e2 = e1.clone();
			e2.disp();
		}

}