package com.primer01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String type = input.nextLine();
        if (type.equals("kvadrat")) {
            System.out.println("Figurata e kvadrat");
            float a = input.nextFloat();
            System.out.println("Plostinata e: " + (int)a*a);
            System.out.println("Perimetarot e: " + 4*a);
        }
        else if (type == "krug") {
            System.out.println("Figurata e krug\n");
            float r = input.nextFloat();
            System.out.println("Plostinata e: " + r*r*Math.PI);
            System.out.println("Perimetarot e: " + 2*Math.PI*r);
        }
    }
}
