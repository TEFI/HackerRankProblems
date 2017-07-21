/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author Mr Troll
 */

import java.util.*;

public class InsertionSortPart1 {
       
    public static void insertIntoSorted(int[] ar) {
        int tmp = ar[ar.length-1];
        int i = ar.length - 2;
        while(i > 0){
            
            if( ar[i] > tmp){
                ar[i+1] = ar[i];
                printArray(ar);
            }else{
                break;
            }
            i--;
        }
        ar[i+1] = tmp;
        printArray(ar);
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 