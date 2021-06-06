package java_project;
import java.util.Scanner;

class Customer {
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

	public String[] split(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}



public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the deatils");
		str = sc.nextLine();
		String[] arrofstr = str.split(",");
		System.out.println(java.util.Arrays.toString(arrofstr));
		
		
		//System.out.println("Customer Details");
		//System.out.println("Name: "+c.getname());
		//System.out.println("Address: "+c.getaddress());
		//System.out.println("Mobile: "+c.getmobile());

	}

}
