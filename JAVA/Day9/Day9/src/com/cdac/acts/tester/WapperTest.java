package com.cdac.acts.tester;

public class WapperTest {

	public static Number add1(Number a, Number b) {
		System.out.println("Number + Number = Number");
		return (Integer)a + (Integer)b;
	}
	
	public static Object add2(Object a, Object b) {
		System.out.println("Object + Object = Object");
		return (Integer)a + (Integer)b;
	}
	
	public static Integer add3(Object a, Object b) {
		System.out.println("Object + Object = Integer");
		return (Integer)a + (Integer)b;
	}
	
	public static int add4(Object a, Object b) {
		System.out.println("Object + Object = int");
		return (Integer)a + (Integer)b;
	}
	
	public static Object add(Object a, Object b) {
		System.out.println("Object");
		return (Integer)a + (Integer)b;
	}
	
	public static Number add(Number a, Number b) {
		System.out.println("Number");
		return a.intValue() + b.intValue();
	}
	
	public static Integer add(Integer a, Integer b) {
		System.out.println("Integer");
		return a + b;
	}
	
	public static int add(int a, int b) {
		System.out.println("int");
		return a + b;
	}
	
	public static void main(String[] args) {
	
		System.out.println(add1(5,6));
		System.out.println(add2(5,6));
		System.out.println(add3(5,6));
		System.out.println(add4(5,6));
		System.out.println(add(5,6));
		System.out.println(add((Object)5,(Object)6));
		System.out.println(add((Number)5,(Number)6));
		System.out.println(add((int)5,(int)6));

	}

}
