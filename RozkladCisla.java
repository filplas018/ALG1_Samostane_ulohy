package samostatnaPrace.ALG1_Samostane_ulohy;

import java.util.Scanner;

public class RozkladCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        while(num > 0)
        {
            while (num % 2 == 0)
            {
                System.out.println(2 + " ");
                num /= 2;
            }

            for (int i = 3; i <= Math.sqrt(num); i += 2)
            {
                while (num % i == 0)
                {
                        System.out.println(i + " ");
                        num /= i;
                }
            }
            if (num > 2){
            System.out.println(num);
            }
            num = sc.nextInt();
            //mám 28
        }
    }
}
