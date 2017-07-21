/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

import java.util.Scanner;
/**
 *
 * @author Mr Troll
 */

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                
        int a = in.nextInt();
        
        long max = a;
        long min = a;
        long sum = a;
        
        long b = in.nextLong();
        if(b < min){
            min = b;
        }else if(b > max){
            max = b;
        }
        sum = sum + b;
        
        long c = in.nextLong();
        if(c < min){
            min = c;
        }else if(c > max){
            max = c;
        }
        sum = sum + c;
        
        long d = in.nextLong();
        if(d < min){
            min = b;
        }else if(d > max){
            max = d;
        }    
        sum = sum + d;
        
        long e = in.nextLong();
        if(e < min){
            min = e;
        }else if(e > max){
            max = e;
        }   
        sum = sum + e;
        
        System.out.println((sum-max)+" "+(sum-min));
    }
}
