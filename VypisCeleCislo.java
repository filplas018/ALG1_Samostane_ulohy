package samostatnaPrace.ALG1_Samostane_ulohy;

import java.util.Scanner;

/**
 *
 * @author Filip Plass
 */
public class VypisCeleCislo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.format("%+04d", num);
    }
}
