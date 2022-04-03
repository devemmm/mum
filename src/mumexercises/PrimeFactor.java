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
public class PrimeFactor {

    public static void main(String[] args) {
        System.out.println(PrimeFactor.largestPrimeFactor(6936));
    }

    public static int largestPrimeFactor(int n) {

        int count = 0, primeFactor = 0;
        if (n <= 1) {
            return 0;
        } else {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    for (int j = 2; j <= i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    if (count == 1) {
                        if (primeFactor < i) {
                            primeFactor = i;
                        }
                    }
                    count = 0;
                }
            }

        }
        return primeFactor;
    }
    

}
