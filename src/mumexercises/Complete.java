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
public class Complete {
    public static int isComplete(int[] a){
        if(a.length == 1){
            return 0;
        }
        
        int sum = 0, even = 0, square = 0, result=0;
        
        for(int i = 0; i<a.length && result == 0; i++){
            if(a[i] % 2 == 0){
                even = 1;
            }
            
            for(int j = 0; j<a.length && sum == 0; j++){
                if(a[i] + a[j] == 8){
                    sum = 1;
                }
            }
            
            for(int k = 2; k<a[i] && square == 0; k++){
                if(k * k == a[i]){
                    square = 1;
                }
            }
            
            if(even == 1 && sum == 1 && square == 1){
                result = 1;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] a = {3, 7, 23, 13, 107, -99, 97, 81};
        System.out.println(isComplete(a));
    }
}
