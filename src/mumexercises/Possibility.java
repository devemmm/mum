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
public class Possibility {
    public static int isAllPossibilities(int[ ] a){
        int leng = a.length, result = 1, found = 0;
        for(int i = 0; i<leng && result == 1; i++){
            for(int j = 0; j<leng && found ==0; j++){
                if(i == a[j]){
                    found = 1;
                }
            }
            
            if(found == 0){
                result = 0;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3};
        System.out.println(isAllPossibilities(a));
    }
}
