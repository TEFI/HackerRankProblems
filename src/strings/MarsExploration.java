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

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int changes = 0;
        for(int i = 0; i < s.length(); i+=3){
            if(s.charAt(i) != 'S')
                changes++;
            if(s.charAt(i+1) != 'O')
                changes++;
            if(s.charAt(i+2) != 'S')
                changes++;            
        }
        System.out.println(changes);
    }
}
