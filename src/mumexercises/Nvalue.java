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
public class Nvalue {

    public static int nValue(int[] a, int n) {
        int[] arr = new int[n];
        int add = 0;
        int result = 1, k = 0, i = 0;
        if (n > a.length) {
            return 0;
        }

        //arr[0] = a[0];
        for (i = 0; i < a.length && result == 1; i++) {
            if (i == 0) {
                arr[k] = a[i];
                k++;
                add++;
            } else {

                int current = a[i], count = 0;
                for (int j = 0; j < n && count == 0; j++) {
                    if (current == arr[j]) {
                        count = 1;
                    }
                }

                if (count == 0) {
                    if (k < n) {

                        arr[k] = a[i];
                        k++;
                        add++;
                    } else {
                        result = 0;
                    }
                }
                //System.err.println(i);

            }
        }

        System.err.println(add);
        return result;

//        if (i < a.length) {
//            return 0;
//        }
//        if (add != n) {
//            return 0;
//        } else {
//            return 1;
//        }

        //for (int j = 0; j < arr.length; j++) {
        //System.err.println(a.length);
        //}
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 8, 1, 1, 1, 3, 3};
        int n = 2;
        System.out.println(nValue(a, n));
    }
}
