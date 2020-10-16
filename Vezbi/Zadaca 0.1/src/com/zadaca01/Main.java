package com.zadaca01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int endValue = input.nextInt();
		System.out.println("Prosti broevi do " + endValue + ": ");
		for (int i=1; i<=endValue; i++) {
	        int counter = 0;
	        for (int j=1; j<=i; j++) {
	            if (i%j == 0) {
	                counter++;
                }
            }
	        if (counter == 2) {
	            System.out.print(i + ", ");
            }
        }
    }
}
