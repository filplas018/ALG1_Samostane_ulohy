package samostatnaPrace.ALG1_Samostane_ulohy;

import java.util.Scanner;

public class Vyskyt {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int ulohy = sc.nextInt();
        for(int i = 0; i < ulohy; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int length = sc.nextInt();
            boolean isIn = false;
            int[] nums = new int[length];
            for(int j = 0; j < length; j++){
                nums[j] = sc.nextInt();
            }
            for(int j = 0; j < length-1; j++){
                if(nums[j] == a && nums[j+1] == b){
                    isIn = true;
                }
            }
            System.out.println(isIn + "\n");
        }
    }
}
