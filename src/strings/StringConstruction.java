/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author Mr Troll
 */

import java.util.*;

public class StringConstruction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int t = 0; t < n; t++){
            String s = in.next();


            Set<Character> set = new HashSet();
            for(int i = 0; i < s.length(); i++){                
                set.add(s.charAt(i));
            } 
        
            System.out.println(set.size());
        
        }
    }
}