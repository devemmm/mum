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
public class niceArray {

    public static int isNiceArray(int[] a) {
        int result = 1, i = 0;
        for (i = 0; i < a.length && result == 1; i++) {
            int current = a[i], found = 0;
            for (int j = 0; j < a.length && found == 0; j++) {
                if (a[j] + 1 == current || a[j] - 1 == current) {

                    found = 1;
                }
            }

            System.err.println("Found equals " + found);

            if (found == 0) {
                result = 0;
            }

        }

        System.err.println("Bigarucyiye " + i);
        return result;
    }

    public static void main(String[] args) {
        int[] a = {2, 10, 9, 3};
        System.out.println(isNiceArray(a));
    }
}
