//package samostatnaPrace.ALG1_Samostane_ulohy;

import java.math.BigInteger;
import java.util.Scanner;

public class Nasobeni
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int pocetUloh = sc.nextInt();
        for (int i = 0; i < pocetUloh; i++)
        {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.multiply(b);
            System.out.println(c);
        }
    }
}
