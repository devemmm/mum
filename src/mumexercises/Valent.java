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
public class Valent {
    
    public static int isOddValent (int[ ] a){
        int current = 0, count = 0,  result = 0;
        for(int i = 0; i<a.length && result == 0; i++){
            current = a[i];
            if(current % 2 != 0){
                for(int j = i+1; j<a.length; j++){
                    if(a[j] == current)
                        count++;
                    System.err.println(count);
                }
            }
            if(count != 0){
                result = 1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(isOddValent(a));
    }
    
}
