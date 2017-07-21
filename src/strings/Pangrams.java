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

public class Pangrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().toLowerCase();
        Set<Character> set = new HashSet();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                set.add(ch);
            }
        }
        
        if(set.size() == 26){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
        
    }
}
