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
public class TwinPrime {
    public static int isTwinPrime(int n){
        if(n<=0)
            return 0;
        boolean result = true;
        for(int i = 2; i<n && result == true; i++){
            if(n%i == 0)
                result = false;
        }
        
        
        if(result){
            int sum = n+2;
            int s = isPrime(sum);
            int differ = n-2;
            int d = isPrime(differ);
            if(s == 1 || d == 1)
                return 1;
            else 
                return 0;
           
        }
        else{
            return 0;
        }
    }
    
    public static int isPrime(int a){
        int result = 1;
        for(int i = 2; i<a && result == 1; i++){
            if(a%i == 0){
                result = 0;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 53;
        System.out.println(isTwinPrime(n));
    }
}
