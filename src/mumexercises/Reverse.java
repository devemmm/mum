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
public class Reverse {
    public static int reverse(int n){
        int temp = 0, r = 0, sum =0, sign = 1;
        if(n<0){
            sign = -1;
            n = n * -1;
        }
        
        while(n>0){
            temp = n%10;
            r = r*10 + temp;
            n = n/10;
        }
        
        r = r*sign;
        
        return r;
    }
    
    public static void main(String[] args) {
        int n =-12345;
        System.out.println(reverse(n));
    }
}
