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
public class Compare {
    public static int isCompare(int[] a){
        int max = 0, min = 0;
        for(int i = 0; i<a.length; i++){
            int current = a[i];
            if(current > max){
                max = current;
            }
        }
        
        for(int j = 0; j<a.length; j++){
            int current = a[j];
            if(current < min){
                min = current;
            }
        }
        return min;
    }
}
