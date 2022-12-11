package samostatnaPrace.ALG1_Samostane_ulohy;//package samostatnaPrace;

import java.util.Scanner;

public class Rozsah {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int ulohy = sc.nextInt();
        int[] numArray = new int[ulohy];
        while(ulohy > 0){
            int i = 0;
            while(i < numArray.length){
                int num = sc.nextInt();
                numArray[i] = num;
                i++;
            }
            int min = findMin(numArray);
            int max = findMax(numArray);
            System.out.format("%n%d %d%n", min, max);
            ulohy = sc.nextInt();
            numArray = new int[ulohy];

        }
    }
    public static int findMin(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min= arr[i];
        }
    }
        return min;
    }

    public static int findMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
        return max;
    }
}