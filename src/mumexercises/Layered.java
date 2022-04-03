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
public class Layered {

    public static int isLayered(int[] a) {
        int isLayered = 1;
        if (a.length == 0) {
            isLayered = 0;
        }
        int count = 0;
        for (int i = 0; i < a.length && isLayered == 1; i++) {
            count++;
            if (i < a.length - 1) {
                if (a[i] != a[i + 1]) {
                    if (count < 2) {
                        isLayered = 0;
                    }
                    count = 0;
                }
                if (a[i] > a[i + 1]) {
                    isLayered = 0;
                }
            } else {
                if (count < 2) {
                    isLayered = 0;
                }
            }
        }

        return isLayered;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 3, 3};
        System.out.println(Layered.isLayered(a));
    }

}
