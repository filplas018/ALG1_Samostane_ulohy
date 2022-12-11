package samostatnaPrace.ALG1_Samostane_ulohy;//package samostatnaPrace;

import java.util.Scanner;

public class StejnaData
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ulohy = sc.nextInt();

        int equal = 0;
        for (int i = 0; i < ulohy; i++)
        {

            int delka = sc.nextInt();
            int[] Arr1 = new int[delka];
            for (int j = 0; j < delka; j++)
            {
                Arr1[j] = sc.nextInt();
            }
            delka = sc.nextInt();
            int[] Arr2 = new int[delka];
            for (int j = 0; j < delka; j++)
            {
                Arr2[j] = sc.nextInt();
            }
                equal = areEqual(Arr1, Arr2)?1:0;

            System.out.println(equal);
            }
            
        }

    public static boolean areEqual(int[] arr1, int[] arr2)
    {
        if(arr1.length == arr2.length){
            bubbleSort(arr1);
            bubbleSort(arr2);
            for (int i = 0; i < arr1.length; i++)
            {
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }

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