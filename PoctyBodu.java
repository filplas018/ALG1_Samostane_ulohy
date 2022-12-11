package samostatnaPrace.ALG1_Samostane_ulohy;

import java.util.Locale;
import java.util.Scanner;

public class PoctyBodu {
    public static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        sc.useLocale(Locale.US);
        int prvni = 0;
        int druhy = 0;
        int treti = 0;
        int ctvrty = 0;
        int pocet = sc.nextInt();

        int i = 0;
        while(i < pocet){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if(x >= 0 && y >= 0){
                prvni++;
            } else if (x < 0 && y >= 0) {
                druhy++;
            } else if (x <= 0 && y < 0) {
                treti++;
            } else if (x > 0 && y < 0){
                ctvrty++;
            }
            i++;
        }
        System.out.format("%d %d %d %d",prvni, druhy, treti, ctvrty);
    }
}
