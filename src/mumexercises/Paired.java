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
public class Paired {
    public static int isPairedN(int[] a, int n) {
        int paired = 0, i = 0;
        for (i = 0; i < a.length && paired == 0; i++) {
            int sum = 0;
            for (int j = i+1; j < a.length; j++) {
                sum = a[i] + a[j];
                if (sum == n) {
                    if (i + j == n) {
                        paired = 1;
                    }
                }
            }
        }
        return paired;
    }


    public static void main(String[] argh) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int n = 6;
        System.out.println(Paired.isPairedN(a, n));
    }
}
