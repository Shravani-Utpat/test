package com.tut2111;

public class Tut3_2111 {
	
	public static void main(String[] args) {
		System.out.println("main Begins");
		checkevenodd(4);
		checkevenodd(9);
		System.out.println("main ends");
	}
	
	public static void checkevenodd(int input) {
		System.out.println("checkevenodd begins");
		if(input % 2 == 0) {
			System.out.println(input + " is a even number");
		}
		else {
			System.out.println(input + " is a odd number");
		}
		System.out.println("checkevenodd ends");
	}

}
