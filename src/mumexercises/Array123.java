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
public class Array123 {

    public static int is235Array(int[] a) {
        int count2 = 0, count3 = 0, count5 = 0, not = 0;
        int leng = a.length, arr = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count2++;
            }
            if (a[i] % 3 == 0) {
                count3++;
            }
            if (a[i] % 5 == 0) {
                count5++;
            }
            if(a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0){
                not++;
            }
        }
        arr = leng - (count2 + count3 + count5);
        sum = count2 + count3 + count5 + not;
        if (sum == leng) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int[] a = {3, 9, 27, 7, 1, 1, 1, 1, 1};
        System.out.println(Array123.is235Array(a));
    }
}
