package samostatnaPrace.ALG1_Samostane_ulohy;//package samostatnaPrace;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sekvence
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int delka = sc.nextInt();
        while(delka > 0){
            int[] nums = new int[delka];
            for(int i = 0; i < delka; i++){
                nums[i] = sc.nextInt();
            }
            Integer[] lengths = new Integer[delka];
            for(int j = 0; j < delka; j++){
                lengths[j] = 1;
            }
            int index = 0;
            for(int i = 0; i < nums.length-1; i++){
                if(nums[i] < nums[i+1] || nums[i] == nums[i+1]){
                    lengths[index]++;
                }
                else{
                    index++;
                }
            }
            int max = Collections.max(Arrays.asList(lengths));
            System.out.println(max);
            delka = sc.nextInt();
        }
    }
}
