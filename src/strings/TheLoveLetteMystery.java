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

public class TheLoveLetteMystery {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++){
            String s = in.next();
            int changes = 0;
            for(int j = 0; j < s.length()/2; j++){
                changes = changes + Math.abs(s.charAt(j) - s.charAt(s.length()-1-j));
            }
            System.out.println(changes);
        }        
    }
}