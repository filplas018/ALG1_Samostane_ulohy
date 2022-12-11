package samostatnaPrace.ALG1_Samostane_ulohy;//package org.example;

import java.util.Scanner;

public class DelitelNasobek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        while((a > 0 || b > 0))
        {
                long gcd = gcd(a,b);
                long lcm = lcm(a,b, gcd);
                System.out.printf("%d %d%n",gcd, lcm);


            a = sc.nextLong();
            b = sc.nextLong();
            //mám 28
        }
    }
    private static long gcd(long a, long b)
    {
        while (a != 0 && b != 0)
        {
            if (a > b)
                a %= b;
            else
                b %= a;
        }

        return a | b;
    }
    public static long lcm(long a, long b, long gcd) {
        return (a*b)/gcd;
    }
}
