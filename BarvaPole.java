package samostatnaPrace.ALG1_Samostane_ulohy;//package samostatnaPrace;

import java.util.Scanner;

public class BarvaPole
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean bila = false;
        while(x >= 0)
        {
            if(((x + y) % 2) == 0)
            {
                bila = true;
            }
            else{
                bila = false;
            }
            System.out.println(bila?"BILA":"CERNA");
            x = sc.nextInt();
            if(sc.hasNext()) y = sc.nextInt();
   //mám 28
        }
    }
}
