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

class StringSimilarity {

    static int solve(String sample){    
        int len=sample.length();
        int sim=0;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(sample.charAt(j-i)==sample.charAt(j))
                    sim++;
                else
                    break;
            }
        }
        return sim;
    }    
    
    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            String line = in.next();
            System.out.println(solve(line));
        }
    }

}
