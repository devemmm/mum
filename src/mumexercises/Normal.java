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
public class Normal {
    
    public static int isNormal(int n){
        if(n == 1){
            return 1;
        }
        
        int result = 1;
        for(int i = 2; i<n && result == 1; i++){
            if(n % i == 0){
                if(i % 2 != 0)
                result = 0;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isNormal(n));
    }
}
