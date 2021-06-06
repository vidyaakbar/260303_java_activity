package java_project;

import java.util.*;

public class Employe {
	private String name;
	private String address;
	private String mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String ename) {
		if(ename==null||ename.length()<3) {
			System.out.println("invalid output");
		}
		else {
			name = ename;
		}	
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String emp_address) {
		if(emp_address==null||emp_address.length()<3) {
			System.out.println("invalid output");
		}
		else {
			address = emp_address;
		}
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String emp_mobile) {
		if(emp_mobile==null||emp_mobile.length()<3) {
			System.out.println("invalid output");
		}
		else {
			mobile = emp_mobile;
		}
	}
	

}