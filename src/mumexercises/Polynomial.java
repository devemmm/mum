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
public class Polynomial {

    public static double eval(int[] a, double x) {

        double eval = 0;
        int current = 0;
        for (int i = 0; i < a.length; i++) {
            current = a[i];
            if (i == 0) {
                eval = eval + current;
            } else {
                eval = eval + current * (power(x, i));
            }
        }
        return eval;
    }

    public static double power(double x, int i) {
        double result = 1;
        for (int j = 1; j <= i; j++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 1.0;
        int[] a = {0, 1, 2, 3, 4};
        System.out.println(Polynomial.eval(a, x));
    }

}
