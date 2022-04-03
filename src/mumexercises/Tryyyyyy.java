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
public class Tryyyyyy {

    public static int powerOfTwo(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return 2;
        }
        return 2 * powerOfTwo(2, exp - 1);
    }

    public static int isPrime(int a) {
        if (a == 2) {
            return 1;
        }
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int isHodder(int n) {
        int k = 0;
        for (int i = 2; i < n && k < n; i++) {
            k = powerOfTwo(2, i) - 1;
        }
        if (k == n && isPrime(n) == 1) {
            return 1;
        }
        return 0;
    }

// Driver code 
    public static void main(String args[]) {

        int n = 31;
        int result = isHodder(n);
        System.out.println(result);

    }

}
