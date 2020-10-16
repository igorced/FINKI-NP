package com.primer02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Vnesi pocetna vrednost: ");
	    int startValue = input.nextInt();
		System.out.println("Vnesi krajna vrednost: ");
	    int endValue = input.nextInt();
	    for (int i=startValue; i<=endValue; i++) {
	    	System.out.print("");
	        System.out.print(i + ", ");
        }
    }
}
