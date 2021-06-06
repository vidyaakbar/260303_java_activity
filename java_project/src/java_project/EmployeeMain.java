package java_project;
import java.util.*;


class Employee {
	private String name;
	private String address;
	private String mobile;
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void setaddress(String address) {
		this.address=address;
	}

	public String getmobile() {
		return mobile;
	}
	
	public void setmobile(String mobile) {
		this.mobile=mobile;
	}
}

public class EmployeeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		String name,address,mobile;
		System.out.println("Enter the name:");
		e.setname(sc.nextLine());
		System.out.println("Enter Address:");
		e.setaddress(sc.nextLine());
		System.out.println("Enter Mobile:");
		e.setmobile(sc.nextLine());
		
		System.out.println("Employee Details");
		System.out.println("Name: "+e.getname());
		System.out.println("Address: "+e.getaddress());
		System.out.println("Mobile: "+e.getmobile());
		

	}
}
