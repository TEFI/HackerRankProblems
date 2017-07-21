/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructivealgorithms;

/**
 *
 * @author Mr Troll
 */


import java.util.*;


public class FlippingtheMatrix {

    private static int maxSum(int[][] matrix, int n) {
        int maxSum = 0;
        int limitMatrix = 2*n-1;

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j ++) {

                maxSum += Math.max(
                        Math.max(matrix[i][j], matrix[i][limitMatrix-j]),
                        Math.max(matrix[limitMatrix-i][j],matrix[limitMatrix-i][limitMatrix-j])
                );
            }
        }

        return maxSum;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int t = 0; t < q; t++) {
            int n = in.nextInt();
            int matrix[][] = new int[2*n][2*n];

            for (int i = 0; i < 2*n; i ++) {
                for (int j = 0; j < 2*n; j ++) {
                    matrix[i][j] = in.nextInt();
                }
            }

            System.out.println(maxSum(matrix, n));
        }
    }
}
