package samostatnaPrace.ALG1_Samostane_ulohy;//package org.example;

import java.util.Scanner;

public class Cifry {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String numString = sc.next();
        long num = Long.parseLong(numString);

        while(num > 0)
        {
            long soucet = 0;
            long soucin = 1;
            for(int i = 0; i < numString.length();i++ ){
                long temp = Integer.parseInt(numString.charAt(i) + "");
                soucet += temp;
                soucin *= temp;
            }
            System.out.format("%d %d%n", soucet, soucin);
            numString = sc.next();
            num = Long.parseLong(numString);
        }

    }
}
