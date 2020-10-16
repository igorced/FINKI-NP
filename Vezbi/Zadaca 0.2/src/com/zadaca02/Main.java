package com.zadaca02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Vraboten []pom = new Vraboten[n];
        for(int i = 0;i<n;i++){
            Vraboten v = new Vraboten();
            v.setFirstName(input.nextLine());
            v.setLastName(input.nextLine());
            v.setExperience(input.nextInt());
            v.setNumOfPoints(input.nextInt());
            pom[i] = v;
            int p = input.nextInt();
            for(int j = 0;j<p;j++){
                Zadaca z = new Zadaca();
                z.setCasovi(input.nextInt());
                z.setOpis(input.next());
                z.setStatus(input.nextBoolean());
                v.dodadiZadaca(z);
            }
        }
        /*Kompanija k = new Kompanija(pom);
        k.pecati();
        k.pecatiPoUspesnost();
        System.out.println("Najangaziran vraboten e: " +
                k.najangaziran());*/
        }
}
