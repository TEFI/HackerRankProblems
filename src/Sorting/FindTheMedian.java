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


public class FindTheMedian {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       List<Integer> list = new ArrayList();
       for(int i = 0; i < n; i++){
            list.add(in.nextInt());
       }
       Collections.sort(list);
       if(n%2 == 0){
           System.out.println((list.get(n/2) + list.get(n/2-1))/2);
       }else{
           System.out.println(list.get(n/2));
       }
    }
}