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


public class BeautifulBinaryString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int numop = 0;
        char arrayB[] = B.toCharArray();
        for(int i = 0; i < n - 2; i++){
            
            if(arrayB[i] == '0' && arrayB[i+1] == '1' && arrayB[i+2] == '0'){
                arrayB[i+2] = '1';
                numop++;
            }
            
        }
        System.out.println(numop);
    }
}