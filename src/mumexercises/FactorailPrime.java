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
public class FactorailPrime {

    public static int isPrime(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n <= 3) {
            return 1;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }

    // Function that returns 1 if n is a factorial prime 
    public static int isFactorialPrime(int n) {

        int result = isPrime(n);
// If n is not prime then return false 
        if (result == 0) {
            System.out.println("Entered number is not a Prime");
            return 0;
        }
        System.out.println("Entered number is Prime");

        int fact = 1;
        int i = 1;
        while (fact <= n + 1) {

            // Calculate factorial 
            fact = fact * i;

            // If n is a factorial prime 
            if (n + 1 == fact || n - 1 == fact) {
                return 1;
            }

            i++;
        }

        // n is not a factorial prime 
        return 0;
    }

    // Driver code 
    public static void main(String args[]) {

        int n = 11;
        int result = isFactorialPrime(n);
        System.out.println(result);

    }
}
