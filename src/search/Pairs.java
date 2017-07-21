/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author Mr Troll
 */

import java.util.*;

public class Pairs {
    static int pairs(int[] array, int k) {

    int numpairs = 0;
    Set<Integer> set = new HashSet();
	for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                numpairs++;
                if (set.contains(k + array[i])) {
                    numpairs++;
                } else {
                    set.add(k + array[i]);
                }            
            } else {
                if (set.contains(k + array[i])) {
                    numpairs++;
                } 
                set.add(array[i]);
                set.add(k + array[i]);
            }

	}
 
	return numpairs;
   
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        String n = in.nextLine();
        String[] n_split = n.split(" ");
        
        int a_size = Integer.parseInt(n_split[0]);
        int k = Integer.parseInt(n_split[1]);
        
        int[] _a = new int[a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = pairs(_a,k);
        System.out.println(res);
    }
}
