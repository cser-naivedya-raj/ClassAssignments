package edu.jecrc.sdt.java_typeCasting;

public class JavaApp {
	public static void execution() {
//		TypeCasting.widening();
//		TypeCasting.narrowing();
//		TypeCasting.wideningChar();
//		TypeCasting.narrowingChar();
		
//		TypeCasting.boxing();
//		TypeCasting.autoboxing();
//		TypeCasting.unboxing();
//		TypeCasting.autounboxing();
		
		Employee employee;
		employee = new SoftwareDeveloper();
		employee.entry();
		employee.meeting();
		employee.exit();
		
		SoftwareDeveloper softwareDeveloper = (SoftwareDeveloper) employee;
		softwareDeveloper.task();
		softwareDeveloper.reverseKT();
		
		
		employee = new SoftwareTester457747();
		employee.entry();
		employee.meeting();
		employee.exit();
		
		SoftwareTester softwareTester = (SoftwareTester) employee;
		softwareTester.task();
		softwareTester.reverseKT();
		
	}
}
