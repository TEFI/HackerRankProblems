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


public class Beautiful3Set {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
	int k = (2*n)/3;
        System.out.println(k+1);
	int y = 2*k-n;
	int x = n-2*y;
        for(int i = 0; i <= y; i++){
            System.out.println(i+" "+(x+i)+" "+(n-x-2*i));
        }
        for(int i = 0; i < k-y; i++){
        System.out.println(y+i+1+" "+i+" "+(n-y-1-2*i));
        }        
    }
}