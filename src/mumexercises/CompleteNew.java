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
public class CompleteNew {
    public static int isComplete(int[] a){
        int min = 0, max = 0, result = 1;
        for(int i = 0; i<a.length && result == 1; i++){
            if(a[i] % 2 == 0){
                if(min == 0 || max == 0){
                  max = a[i];
                  min = a[i];
                }
                
                if(a[i]>max){
                    max = a[i];
                }
                
                if(a[i]<min){
                    min = a[i];
                }
            }
        }
        
        
        if(min == max){
            return 0;
        }
        else if(min ==0 || max == 0){
            return 0;
        }
        
        return result;
    }
    
    
    public static void main(String[] args) {
        int[] a = {5, 7, 9, 13};
        System.out.println(isComplete(a));
    }
}
