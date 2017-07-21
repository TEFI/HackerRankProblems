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

public class MakingAnagrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s1 = in.next();
        String s2 = in.next();

        int equals = 0;
        
        Map<Character, Integer> map1 = new HashMap();
        for(int i = 0; i < s1.length(); i++){
                
            if(map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
            }else{
                map1.put(s1.charAt(i), 1);
            }
        } 
                
        Map<Character, Integer> map2 = new HashMap();
        for(int i = 0; i < s2.length(); i++){
                
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i), map2.get(s2.charAt(i)) + 1);
            }else{
                map2.put(s2.charAt(i), 1);
            }
        }            
                
        for (Character key : map1.keySet()) {
                    
            if(map2.containsKey(key)){
                equals = equals + Math.min(map1.get(key), map2.get(key))*2;
            }
        }        
             
        System.out.println(s1.length() + s2.length() - equals);
    }
         
}