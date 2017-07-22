/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourexercices;

/**
 *
 * @author Mr Troll
 */
import java.util.Scanner;
 
public class Knapsack
{
    
    //Complexity O(nw)
    static int knapSack(int n, int w, int value[], int weight[]){
        int K[][] = new int[n+1][w+1];
 
        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= w; j++){
                if (i == 0 || j == 0){
                    K[i][j] = 0;
                }else if (weight[i-1] <= j){
                    K[i][j] = Math.max(value[i-1] + K[i-1][j-weight[i-1]],  K[i-1][j]);
                }else{
                    K[i][j] = K[i-1][j];
                }
            }
        }
 
        return K[n][w];
    }
 
    public static void main(String args[]){
        /*
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Number of items: ");
        int n = sc.nextInt();
        
        System.out.println("Knapsack capacity: ");
        int w = sc.nextInt();        
 
        System.out.println("The items values: ");
        int value[] = new int[n];
        for(int i = 0; i < n; i++){
            value[i] = sc.nextInt();  
        }
        
        System.out.println("The items weight: ");
        int weight[] = new int[n];
        for(int i = 0; i < n; i++){
            weight[i] = sc.nextInt();
        }
        
        sc.close();
        /**/
         
        int n = 5;                
        int w = 70;        
        int value[] = {60, 14, 88, 30, 60};
        int weight[] = {10, 20, 30, 20, 30};

        System.out.println("The optimum value that can be put in a knapsack of capacity " + w +" is: " + knapSack(n, w, value, weight));
        
    }   
}


