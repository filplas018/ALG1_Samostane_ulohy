package samostatnaPrace.ALG1_Samostane_ulohy;//package samostatnaPrace;

import java.util.Scanner;

public class SpojovaniPoli
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int delka = sc.nextInt();
        while(delka > 0){
            int[] pole1 = new int[delka];
            for (int i = 0; i < delka; i++)
            {
                pole1[i] = sc.nextInt();
            }
            delka = sc.nextInt();
            int[] pole2 = new int[delka];
            for (int i = 0; i < delka; i++)
            {
                pole2[i] = sc.nextInt();
            }
            int[] novePole = joinArrays(pole1, pole2);
            bubbleSort(novePole);
            for (int i = 0; i < novePole.length; i++)
            {
                System.out.print(novePole[i] + " ");
            }
            System.out.print("\n");
            delka = sc.nextInt();
        }
    }
    public static int[] joinArrays(int[] arr1, int[] arr2){
        int len = arr1.length + arr2.length;
        int[] newArr = new int[len];
        for (int i = 0; i < arr1.length; i++)
        {
            newArr[i] = arr1[i];
        }
        for (int i = arr1.length; i < len; i++)
        {
            newArr[i] = arr2[i - arr1.length];
        }
        return newArr;
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){

                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
}
