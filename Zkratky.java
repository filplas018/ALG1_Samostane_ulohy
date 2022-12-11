package samostatnaPrace.ALG1_Samostane_ulohy;//package samostatnaPrace;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zkratky
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ulohy = sc.nextInt();
        for (int i = 0; i < ulohy; i++)
        {
            ArrayList<String> words = new ArrayList<String>();
            String line = "";
            do{
                line = sc.nextLine();
            }while(line.isEmpty());


            String[] str = line.split(" ");

            // Now convert string into ArrayList
            words = new ArrayList<String>(
                    Arrays.asList(str));
            String zkratka = "";
            for (int j = 0; j < words.size(); j++)
            {
                if(words.get(j).length() > 2){

                    zkratka += words.get(j).charAt(0);
                }
            }

            zkratka = zkratka.toUpperCase();
            System.out.println(zkratka);
        }
    }
}
