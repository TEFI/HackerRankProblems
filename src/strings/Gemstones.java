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

public class Gemstones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        List<Set> list = new ArrayList();
        for(int i = 0; i < n; i++){
            String s = in.next();
            Set<Character> set = new HashSet();
            for(char c:s.toCharArray()){
                set.add(c);
            }
            list.add(set);
        }
        
        if(list.size() == 1){
            System.out.println(list.get(0).size());
        }else{
            int gemelements = 0;
            Set<Character> set = list.get(0);

            for(char e:set){
                boolean gemelem = true;
                for(int i = 1; i < list.size(); i++){
                    if(list.get(i).contains(e) == false){
                        gemelem = false;
                        break;
                    }
                }
                if(gemelem == true){
                    gemelements++;
                }
            }
            System.out.println(gemelements);
        }
        
    }
}