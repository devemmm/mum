/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mumexercises;

/**
 *
 * @author gennext
 */
public class Fibonacci {
    public static void main(String[] args) {
        int num = 6;
        int ret = isFibonacci(num);
        
        System.out.println(ret);
        
    }
    
    public static int isFibonacci(int n){
        
        int tempVal = (5 * n * n) + 4;
        int tempVal2 = (5 * n * n) - 4;
        double val = Math.sqrt(tempVal);
        double val2 = Math.sqrt(tempVal2);

        
        if(val % 1 == 1 || val2 % 1 == 0){
            return 1;
        }
        return 0;
    }
}
