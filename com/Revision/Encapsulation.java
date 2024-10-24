package com.Revision;

public class Encapsulation {
private int salary;

public void setSalary(int sal) {
	if(sal>0) {
		salary=sal;
		
	}else {
		salary=0;
		
	}
}
public int getSalary() {
	return salary;
}
	
}


