/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mumexercises;

/**
 *
 * @author User
 */
public class Common {
    public static int[] f(int[] first, int[] second){
        if(first == null || second == null){
            return null;
        }
        
        int count = 0, found = 0;
        int[] a = new int[found];
        for(int i = 0; i<first.length; i++){
            int current = first[i];
            found = 0;
            for(int j = 0; j<second.length && found == 0; j++){
                if(current == second[j]){
                    found = 1;
                }
            }
            
            if(found == 1){
                
                count++;
            }
        }
        
        int[] result = new int[count];
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] first =null;
        int[] second =  {};
        System.err.println(f(first, second));
    }
}
