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

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        int k = in.nextInt();

         for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                   if(str.charAt(i)>=97){
                       System.out.print(""+(char)(97+((str.charAt(i)-97+k)%26)));
                   }else{
                        System.out.print(""+(char)(65+((str.charAt(i)-65+k)%26)));                                          }                               
              }else{
                  System.out.print(""+(char)(str.charAt(i)));
            }
        }        
                
    }
}
