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
public class NBasingRounding {

    public static int[] doIntegerBasedRounding(int[] a, int n) {
        int temp;
        int[] b = new int[a.length];
        if (n < 0) {
            return a;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                b[i] = a[i];
            } else if (a[i] > 0) {
                temp = a[i] % n;
                if (temp > n / 2) {
                    b[i] = a[i] + (n - temp);
                    //System.out.println(i);
                }
                //System.out.println(i);
                if (temp <= n / 2) {
                    b[i] = a[i] - temp;
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = 2;
        int[] result = doIntegerBasedRounding(a, n);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

}
