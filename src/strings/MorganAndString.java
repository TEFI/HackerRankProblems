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

public class MorganAndString {
    public static void solve(StringBuilder sb1, StringBuilder sb2){
        StringBuilder sb3 = new StringBuilder();
        
        int i = 0, j = 0;
        
        while(i < sb1.length() && j < sb2.length()){            
            if(sb1.charAt(i) > sb2.charAt(j)){
                sb3.append(sb2.charAt(j));
                j++;
            }else if(sb1.charAt(i) < sb2.charAt(j)){
                sb3.append(sb1.charAt(i));
                i++;
            }else {
                    int x = i, y = j;
                    char a = sb1.charAt(i);
                    for(; x < sb1.length() && y < sb2.length(); x++, y++) {
                        if (sb1.charAt(x) != sb2.charAt(y)) {
                            break;
                        } else if (sb1.charAt(x) > a) {
                            sb3.append(sb1.substring(i, x)).append(sb2.substring(j, y));
                            i = x; j = y;
                            a = sb1.charAt(x);
                        }
                    }

                    if (x == sb1.length()) {
                        sb3.append(sb2.charAt(j));
                        j++;
                    } else if (y == sb2.length()) {
                        sb3.append(sb1.charAt(i));
                        i++;
                    } else {
                        if (sb1.charAt(x) < sb2.charAt(y)) {
                            sb3.append(sb1.charAt(i));
                            i++;
                        } else {
                            sb3.append(sb2.charAt(j));
                            j++;
                        }
                    }
            }
        }
       
        sb3.append(sb1.substring(i)).append(sb2.substring(j));
        System.out.println(sb3.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int t = 0; t < n; t++){
            
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb1.append(in.next());
            sb2.append(in.next());
                       
            solve(sb1, sb2);        
        }
    }
}
