/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;
import java.util.*;

public class TheGridSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            
            boolean solution = false;
            for(int i = 0; i < R; i++){
                
                if(solution == true){
                    break;
                }
                for(int j = 0; j < C; j++){
                    boolean found = true;
                    if(G[i].charAt(j) == P[0].charAt(0) && i+r-1 < R && j+c-1 < C){
                        for(int k = 0; k < r; k++){
                            if(found == false){
                                break;
                            }
                            for(int l = 0; l < c; l++){
                                if(G[i+k].charAt(j+l) != P[k].charAt(l)){
                                    found = false;
                                    break;
                                }
                            }                            
                        }
                        if(found == true){
                            System.out.println("YES");
                            solution = true;                            
                        }

                    }
                    
                }
                
            }  
            if(solution == false){
                System.out.println("NO");
            }
            
        }
    }
}