//package samostatnaPrace.ALG1_Samostane_ulohy;

import java.util.Scanner;

public class RozmeryPlochy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ulohy = scanner.nextInt();
        for (int i = 0; i < ulohy; i++) {
            String smery = "";
            while(!smery.endsWith("E")){
                smery+= scanner.nextLine();
            }
            int minX = 0, maxX = 0, minY = 0, maxY = 0;
            int x = 0, y = 0;
            for (int j = 0; j < smery.length(); j++) {
                char smer = smery.charAt(j);
                if(smer == 'E'){
                    break;
                }else if (smer == 'S') {
                    y++;
                } else if (smer == 'J') {
                    y--;
                } else if (smer == 'Z') {
                    x--;
                } else if (smer == 'V') {
                    x++;
                }
                minX = Math.min(minX, x);
                maxX = Math.max(maxX, x);
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }
            System.out.println((maxX - minX + 1) + " " + (maxY - minY + 1));
        }
    }
}
