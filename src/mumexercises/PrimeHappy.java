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
public class PrimeHappy {

    public static int isPrimeHappy(int n) {
        int sum = 0, i, count;
        for (int j = 2; j < n; j++) {
            count = 1;
            for (i = 2; i < j && count == 1; i++) {
                if (j % i == 0) {
                    count = 0;
                }
            }
            if (count == 1) {
                sum  = sum + j;
            }
        }
        System.out.println("Sum is "+sum);
        if (sum%n == 0){
            return 1;
        }
        else
            return 0;
    }
    
    public static void main(String[] args) {
        int n= 32;
        System.out.println(PrimeHappy.isPrimeHappy(n));
    }
//        if (sum % n == 0){
//            return 0;
//        }
//        else {
//            return 1;
//        }
}


