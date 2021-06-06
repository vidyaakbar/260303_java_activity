package java_project;

import java.util.Scanner;

public class EmployeMain {

	public static void main(String[] args) {
		
		Employe e=new Employe();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name:");
		e.setName(scan.nextLine());
		System.out.println("Enter Address:");
		e.setAddress(scan.nextLine());
		System.out.println("Enter Mobile:");
		e.setMobile(scan.nextLine());
		System.out.println("Employee Details");
		System.out.println("Name: "+e.getName());
		System.out.println("Address: "+e.getAddress());
		System.out.println("Mobile: "+e.getMobile());
		int input;
		do {

		System.out.println("Verify and Update the details:");
		System.out.println("Menu\n1. Update Employee name\n2. Update Employee Address\n3. Update Employee mobile\n4. All the information correct/Exit");
		input=scan.nextInt();
		switch(input) {
		case 1: System.out.println("Current name is: "+e.getName());
		        System.out.println("Enter the name:");
		        scan.nextLine();
		        e.setName(scan.nextLine());
		        break;
		case 2: System.out.println("Current address is: "+e.getAddress());
                System.out.println("Enter the address:");
                scan.nextLine();
                e.setAddress(scan.nextLine());
                break;
		case 3: System.out.println("Current mobile no is: "+e.getMobile());
		        System.out.println("Enter the mobile:");
		        scan.nextLine();
		        e.setMobile(scan.nextLine());
		        break;
		case 4:	 System.out.println("The Details are:");
		         System.out.println("Name: "+e.getName());
		         System.out.println("Address: "+e.getAddress());
		         System.out.println("Mobile: "+e.getMobile());
		        
		}
		
		}while(input!=4);
	}

}