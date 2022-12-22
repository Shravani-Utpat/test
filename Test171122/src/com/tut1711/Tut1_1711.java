
package com.tut1711;

public class Tut1_1711 {
	public static void main(String[] args) {
		int i = 10;
		if (i++ == 10) {
			System.out.println("If Block" +i);
		}
		else if (i++ == 11) {
			System.out.println("Else if Block" +i );
		}
		else {
			System.out.println("Else block" +i);
		}
	}

}
