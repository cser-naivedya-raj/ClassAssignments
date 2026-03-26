package edu.jecrc.sdt.java_typeCasting;

public sealed class Employee permits SoftwareDeveloper, SoftwareTester{
	public void entry() {
		System.out.println("Employee entered into the campus");
		
	}
	
	public void meeting() {
		System.out.println("Employee is attending the meeting");
	}
	
	public void exit() {
		System.out.println("Employee exited from the campus");
		System.out.println();
	}
	
}
