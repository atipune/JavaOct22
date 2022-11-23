package com.java.Methods;

import com.java.Methods2.DiffPackageClass;

public class SameClass {
	public static void sameClassStaticMethod()
	{
		System.out.println("Different static method from same class");
	}
	public void sameClassNonStaticMethod()
	{
		System.out.println("Non static method from same class");
	}
	public static void main(String[] args) {
		System.out.println("Program start");
		sameClassStaticMethod();
		DiffClass.diffClassMethod();
		DiffPackageClass.diffPackStaticMethod();
		
		SameClass object= new SameClass();
		object.sameClassNonStaticMethod();
		
		DiffClass object2 = new DiffClass();
		object2.diffClassNonStaticMethod();
		
		DiffPackageClass object3 = new DiffPackageClass();
		object3.diffPackNonStaticMethod();
		
		System.out.println("Program end");
	}
}
