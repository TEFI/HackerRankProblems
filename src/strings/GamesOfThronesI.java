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


public class GamesOfThronesI {

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
         
        int sum = 0;            
        for (Integer freq : map.values()) {
            sum = sum + freq%2;
        }        
        if(sum > 1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        
    }
      
}