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
/*
If n is even then k = n/2:
F(n) = [2*F(k-1) + F(k)]*F(k)

If n is odd then k = (n + 1)/2
F(n) = F(k)*F(k) + F(k-1)*F(k-1)

Complexity for this recurration O(Log n)
*/
public class NFibonacciNumber {
     
private final static long F[] = new long[1000];
 
public static long fib(int n)
{
    // Base cases
    if (n == 0)
        return 0;
    if (n == 1 || n == 2)
        return (F[n] = 1);
 
    // If fib(n) is already computed
    if (F[n] != 0)
        return F[n];
 
    int k = ((n & 1) != 0)? (n+1)/2 : n/2;
   

    F[n] = ((n & 1) != 0)? (fib(k)*fib(k) + fib(k-1)*fib(k-1))
           : (2*fib(k-1) + fib(k))*fib(k);
 
    return F[n];
}     
    public static void main (String args[]){
        
        int n = 500;
        System.out.println(fib(n));

    }    
}
