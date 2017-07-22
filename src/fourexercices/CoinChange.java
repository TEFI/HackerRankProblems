/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourexercices;

import java.util.Scanner;

/**
 *
 * @author Mr Troll
 */
public class CoinChange {
    //Complexity O(mn)
    static long getWays(int C[], int m, int n){
         
        long table[] = new long[n+1];

        table[0] = 1;
 
        for (int i = 0; i < m; i++){
            for (int j = C[i]; j <= n; j++){
                table[j] += table[j-C[i]];
                System.out.println(table[j]);
            }
        }
        
        return table[n];
    }
 

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int C[] = new int[m];
        for(int c_i = 0; c_i < m; c_i++){
            C[c_i] = in.nextInt();
        }

        System.out.println(getWays(C, m, n));
    }
    
}
