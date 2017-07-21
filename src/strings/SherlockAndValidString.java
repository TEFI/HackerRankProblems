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

public class SherlockAndValidString {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s = in.next();
        
        Map<Character, Integer> map = new HashMap();
        for(int i = 0; i < s.length(); i++){                
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i), 1);
            }
        } 
         
        Map<Integer, Integer> map_freq = new HashMap();
        for(Integer freq : map.values()) {
            if(map_freq.containsKey(freq)){
                map_freq.put(freq, map_freq.get(freq) + 1);
            }else{
                map_freq.put(freq, 1);
            }
        }        
        if(map_freq.size() == 1 || (map_freq.size() == 2 && Collections.min(map_freq.values()) == 1)){
            System.out.println("YES");            
        }else{
            System.out.println("NO");
        }
    }
}