package samostatnaPrace.ALG1_Samostane_ulohy;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kalkulator
{

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ScriptException
    {
        int ulohy = sc.nextInt();
        for (int i = 0; i < ulohy; i++)
        {
            String znak = sc.next();
            ArrayList<String> znaky = new ArrayList<String>();
            znaky.add(znak);
            int temp = 0;
            while (!znak.equals("="))
            {
                znak = sc.next();
                znaky.add(znak);
            }
            for (int j = 0; j < znaky.size() - 2; j += 2)
            {
                int mTemp = 0;
                String a = znaky.get(j);
                String b = znaky.get(j + 2);
                String op = znaky.get(j + 1);
                if (op == "*" || op == "/")
                {
                    //mTemp += getOperator(a, op, b);
                    znaky.set(j, null);
                    znaky.set(j + 1, null);
                    znaky.set(j + 2, null);
                }
            }
        }
    }

    /*public static int getOperator(String a, String op, String b)
    {
        if (op == "+") return Integer.parseInt(a) + Integer.parseInt(b);
        if (op == "-") return Integer.parseInt(a) - Integer.parseInt(b);
        if (op == "*") return Integer.parseInt(a) * Integer.parseInt(b);
        if (op == "/") return Integer.parseInt(a) / Integer.parseInt(b);
    }*/
}
