
package java_project;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Employee details");
		System.out.println("Enter the name");
		e.setName(scan.next());
		System.out.println("Enter Address");
		e.setAddress(scan.next());
		System.out.println("Enter Mobile");
		e.setMobile(scan.next());
		System.out.println("Employee Details");
		System.out.println("Name: "+e.getName());
		System.out.println("Address: "+e.getAddress());
		System.out.println("Mobile: "+e.getMobile());
	}

}