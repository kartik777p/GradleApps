package com.nit.besics;

 

public class MathOperations {
	public int sum(int x,int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		MathOperations operations=null;
		operations=new MathOperations();
		System.out.println("Result is ::- "+operations.sum(20,20));
	}

}
