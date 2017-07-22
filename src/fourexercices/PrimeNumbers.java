/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourexercices;

import java.util.Scanner;

/**
 *
 * @author Mr Troll
 */
public class PrimeNumbers {

    
    public static void findPrimeNumbers(int n){
        boolean prime[] = new boolean[n+1];
        //O(sqrt(n)) 
        for(int p = 2; p*p <=n; p++)
        {            
            if(prime[p] == false)
            {
                // Update all multiples of p O(log(n))
                for(int i = p*2; i <= n; i += p)
                    prime[i] = true;
            }
        }
        //Complexity O(sqrt(n)*log(n))
        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == false)
                System.out.print(i + " ");
        }
    }
     
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Finds all prime numbers less than or equal N: ");
        int n = sc.nextInt();
        
        System.out.println("Following are the prime numbers smaller than or equal to " + n);
        
        findPrimeNumbers(n);
    }
    
}
