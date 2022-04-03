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
public class Onion {

    public static int isOnionArray(int[] a) {
        if (a.length == 1 && a[0] <= 10) {
            return 1;
        }
        for (int j = 0, k = a.length - 1; j < k; j++, k--) {
            if (a[j] + a[k] > 10) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a = {-2, 5, 0, 5, 12};
        System.out.println(Onion.isOnionArray(a));
    }
}
