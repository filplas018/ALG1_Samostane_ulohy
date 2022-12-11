package samostatnaPrace.ALG1_Samostane_ulohy;//package samostatnaPrace;

import java.util.ArrayList;
import java.util.Scanner;

public class Maxima {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int ulohy = sc.nextInt();
        System.out.println("\n");
        for(int i = 0; i < ulohy; i++){
            int num = sc.nextInt();
            ArrayList<Integer> nums = new ArrayList<Integer>();
            while(num > 0){
                nums.add(num);
                num = sc.nextInt();
            }
            ArrayList<Integer> maxes = getMaxes(nums);
            int[] app = new int[4];
            for(int j = 0; j < maxes.size(); j++){
                for(int  k= 0; k < nums.size(); k++){
                    if(maxes.get(j) == nums.get(k)){
                        app[j] += 1;
                    }
                }
            }
            System.out.format("%d %d%n%d %d%n%d %d%n%d %d%n", maxes.get(0), app[0],maxes.get(1), app[1],maxes.get(2), app[2],maxes.get(3), app[3]);
        }
    }
    public static ArrayList<Integer> getMaxes(ArrayList<Integer> arr)
    {
        int arr_size = arr.size();
        int first = arr.get(0);
        for (int i = 1; i < arr_size ; i++){
            if (arr.get(i) > first)
                first = arr.get(i);
        }
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr_size ; i++){
            if (arr.get(i) > second &&
                    arr.get(i) < first)
                second = arr.get(i);
        }
        int third = Integer.MIN_VALUE;
        for (int i = 0;i < arr_size ; i++){
            if (arr.get(i) > third &&
                    arr.get(i) < second)
                third = arr.get(i);
        }
        int fourth = Integer.MIN_VALUE;
        for (int i = 0;i < arr_size ; i++){
            if (arr.get(i) > fourth &&
                    arr.get(i) < third)
                fourth = arr.get(i);
        }
        ArrayList<Integer> maxes = new ArrayList<Integer>();
        maxes.add(first);
        maxes.add(second);
        maxes.add(third);
        maxes.add(fourth);
        return maxes;
    }
}