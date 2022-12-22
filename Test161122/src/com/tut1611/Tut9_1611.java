package com.tut1611;

public class Tut9_1611 {
	public static void main(String[] args) {
		int i = 6;
		i= i++;// Assign the unchanged value to j and then i gets incremented
		System.out.println(i);
		i = i--;
		System.out.println(i);
		i = ++i;
		System.out.println(i);
		i = --i;
		System.out.println(i);
	}
}
