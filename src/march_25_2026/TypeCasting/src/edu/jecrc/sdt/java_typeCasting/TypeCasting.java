package edu.jecrc.sdt.java_typeCasting;

public class TypeCasting {
	public static void widening() {
		int i = 10;
		System.out.println("i is: " + i);
		double d = i;
		System.out.println("d is: " + d);
		System.out.println();
		
	}
	
	public static void narrowing() {
		double d = 12.34;
		System.out.println("d is : " + d);
		int i = (int) d;
		System.out.println("i is : " + i);
		System.out.println();
	}
	
	public static void wideningChar() {
		char ch = 'a';
		System.out.println("i is: " + ch);
		int i = ch;
		System.out.println("i is: " + i);
		System.out.println();
		
	}
	
	public static void narrowingChar() {
		int i = 65;
		System.out.println("i is: " + i);
		char ch = (char) i;
		System.out.println("ch is: " + ch);
		System.out.println();
		
	}
	
	public static void boxing() {
		int i = 10;
		System.out.println("i is : " + i);
		Integer I = Integer.valueOf(i);
		System.out.println("I is : " + I);
		System.out.println();
	}
	
	public static void autoboxing() {
		int i = 10;
		System.out.println("i is : " + i);
		Integer I = i;
		System.out.println("I is : " + I);
		System.out.println();
	}
	
	public static void unboxing() {
		Integer I = Integer.valueOf(10);
		System.out.println("I is : " + I);
		int i = I.intValue();
		System.out.println("i is : " + i);
		System.out.println();
	}
	
	public static void autounboxing() {
		Integer I = 10;
		System.out.println("I is : " + I);
		int i = I;
		System.out.println("i is : " + i);
		System.out.println();
	}
}
