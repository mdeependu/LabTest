package com.r177219068.q2;
import java.util.Scanner;

public class Department {

		protected String departmentName;
		
		Department()
		{
			System.out.println("Department Name");
			Scanner sc = new Scanner(System.in);
			departmentName = sc.nextLine();
			
		}
}
