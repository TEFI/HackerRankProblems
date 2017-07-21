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

public class TwoStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int t = 0; t < n; t++){
            String s1 = in.next();
            String s2 = in.next();

            Set<Character> set1 = new HashSet();
            for(int i = 0; i < s1.length(); i++){                
                set1.add(s1.charAt(i));
            } 

            Set<Character> set2 = new HashSet();
            for(int i = 0; i < s2.length(); i++){
                set2.add(s2.charAt(i));
            }            

            boolean substring = false;
            for (char c : set1) {

                if(set2.contains(c) == true){
                    substring = true;
                    break;
                }
            }        
            
            if(substring == true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        
        }
      
    }
}