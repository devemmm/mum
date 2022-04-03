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
public class Daphne {
    
    public static int isDaphne (int[ ] a){
        int current = 0, result = 1;
        
        for(int i = 0; i<a.length -1; i++){
             
            current = a[i];
            if(current %2 == 0){
                if(a[i+1]%2 != 0){
                    result = 0;
                }
            }
            else if(current %2 !=0){
                if(a[i+1]%2 == 0){
                    result = 0;
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] a = {3, 2, 2};
        System.out.println(isDaphne(a));
    }
}
