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


public class FunnyString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++){
            String s = in.next();             
            int length = s.length();
            boolean funny = true;

            for(int j = 0; j < length/2; j ++){
                
                boolean comp = Math.abs(s.charAt(j) - s.charAt(j+1)) == Math.abs(s.charAt(length-1-j) - s.charAt(length-2-j));
                
                if(comp == false){
                    funny = false;
                    break;
                }
                
            }
            
            if(funny == true){
                System.out.println("Funny");
            }else{
                System.out.println("Not Funny");
            }
            
        }
        
    }
}