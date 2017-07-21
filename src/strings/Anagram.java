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

public class Anagram {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++){
            String s = in.next();
            int size = s.length();
            int changes = 0;
            
            if(size%2==1){
                System.out.println("-1");
            }else{

                Map<Character, Integer> map1 = new HashMap();
                for(int j = 0; j < size/2; j++){
                
                    if(map1.containsKey(s.charAt(j))){
                        map1.put(s.charAt(j), map1.get(s.charAt(j)) + 1);
                    }else{
                        map1.put(s.charAt(j), 1);
                    }
                } 
                
                Map<Character, Integer> map2 = new HashMap();

                for(int j = size/2; j < size; j++){

                    if(map2.containsKey(s.charAt(j))){
                        map2.put(s.charAt(j), map2.get(s.charAt(j)) + 1);
                    }else{
                        map2.put(s.charAt(j), 1);
                    }
                }                
                
                for (Character key : map1.keySet()) {
                    
                    if(map2.containsKey(key)){
                        if(map1.get(key) > map2.get(key)){
                            changes = changes + map1.get(key) - map2.get(key);
                        }                        
                    }else{
                        changes = changes + map1.get(key);
                    }
                }
                
             System.out.println(changes);
                
            }
        }
                
    }
}