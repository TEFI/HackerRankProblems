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

public class SuperReducedString{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.next();  
        
        List<Character> st = new ArrayList();
        for(int i = 0; i < s.length(); i++){
            
            if(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                i++;                
            }else{
                if(st.size() > 0 && st.get(st.size()-1) == s.charAt(i)){
                    st.remove(st.size()-1);
                }else{
                    st.add(s.charAt(i));    
                }
                
            }            
        }
        
        if(st.isEmpty()){
            System.out.println("Empty String");
        }else{            
            for(char c:st){
                System.out.print(c);
            }
        }
    }
}
