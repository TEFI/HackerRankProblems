/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

/**
 *
 * @author Mr Troll
 */
import java.util.*;


public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sumd1 = 0;
        int sumd2 = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                int value = in.nextInt();
                if(i==j){
                    sumd1 = sumd1 + value;
                }
                if(i==n-j-1){
                    sumd2 = sumd2 + value;
                }                
            }
        }
        
        System.out.println(Math.abs(sumd1-sumd2));
    }
}
