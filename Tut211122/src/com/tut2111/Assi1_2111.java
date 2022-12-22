package com.tut2111;

public class Assi1_2111 {
		  
	public static void main(String[] args) {
		System.out.println("main Begins");
		checkprime(1);
		checkprime(5);
		System.out.println("main ends");
	}
	
	public static void checkprime(int input) {
		System.out.println("checkprime begins");
		
		int i, count=0;
		for(i = 2; i < input; i++) {
			if(input % i == 0){
				count++;
		        break;
		    }
		}
		
		if(count==0)
			System.out.println(input + " is a prime number");
		else
		    System.out.println(input + " is not a prime number");
		
		System.out.println("checkprime ends");
	}

}
