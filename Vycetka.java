//package samostatnaPrace.ALG1_Samostane_ulohy;

import java.util.Scanner;

public class Vycetka
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int pocetPlatidel = sc.nextInt();
        while(pocetPlatidel > 0){
            long[] platidla = new long[pocetPlatidel];
            for (int i = 0; i < pocetPlatidel; i++)
            {
                platidla[i] = sc.nextLong();
            }
                long castka = sc.nextLong();
                while(castka > 0){
                    long[] pocty = vycetka(platidla, castka);
                    for (int i = 0; i < pocty.length; i++)
                    {
                        System.out.format("%d ", pocty[i]);
                    }
                    System.out.println();
                    castka = sc.nextLong();
                }

            pocetPlatidel = sc.nextInt();
        }
    }
    public static long[] vycetka(long[] platidla, long castka){
        long[] pocty = new long[platidla.length];
        for (int i = 0; i < platidla.length; i++)
        {
            if(platidla[i] <= castka){
                long p = castka/platidla[i];
                pocty[i]+=p;
                castka-=platidla[i]*p;
            }
        }
        return pocty;
    }
}
