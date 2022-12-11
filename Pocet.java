package samostatnaPrace.ALG1_Samostane_ulohy;//package samostatnaPrace;

import java.util.ArrayList;
import java.util.Scanner;

public class Pocet {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ulohy = sc.nextInt();
        System.out.println("\n");
        for(int i = 0; i < ulohy; i++)
        {
            int num = sc.nextInt();
            int firstNum = num;
            int naturalDivisors = getNaturalDivisors(firstNum).size();
            int count = 0;

            num = sc.nextInt();
            while(num > 0)
            {

                if((getNaturalDivisors(num).size() == naturalDivisors)){
                    count++;
                }
                num = sc.nextInt();
            }
            System.out.println(count);
        }
    }

    public static ArrayList<Integer> getNaturalDivisors(int num)
    {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        if(num != 1){
            if(num < 0){
                for(int i = num + 1; i < 0; i++)
                {
                    if(num % i == 0){
                        divisors.add(i);
                    }
                }
            }
            for(int i = 2; i < Math.abs(num); i++)
            {
                if(num % i == 0){
                    divisors.add(i);
                }
            }
        }

        return divisors;
    }
}
/*
8

17 2 7 8 1 18 4 -1

2 2 3 15 -1

1 8 5 15 11 -1

20 9 3 8 2 5 18 11 12 19 2 20 16 12 8 15 0

6 13 20 18 8

8 19 -1

15 2 4 13 1 3 4 19 -3

10 7 3 10 7 -2

15 7 4 20 16 9 -1
* */