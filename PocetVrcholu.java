//package samostatnaPrace.ALG1_Samostane_ulohy;
import java.util.Scanner;


public class PocetVrcholu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count;
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix;

        while (m > 0) {
            count = 0;
            matrix = CreateMatrix(m, n);
            for (int i = 1; i < m - 1; i++) {
                for (int j = 1; j < n - 1; j++) {
                    if (matrix[i][j] > matrix[i - 1][j - 1]
                            && matrix[i][j] > matrix[i - 1][j]
                            && matrix[i][j] > matrix[i - 1][j + 1] && matrix[i][j] > matrix[i][j - 1]
                            && matrix[i][j] > matrix[i][j + 1] && matrix[i][j] > matrix[i + 1][j - 1]
                            && matrix[i][j] > matrix[i + 1][j] && matrix[i][j] > matrix[i + 1][j + 1]) {
                        count++;
                    }
                }
            }
            System.out.println(count);

            m = sc.nextInt();
            n = sc.nextInt();
        }
    }

    public static int[][] CreateMatrix(int m, int n) {
        int matrix[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
}