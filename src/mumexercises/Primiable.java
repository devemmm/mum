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
public class Primiable {

    public static int isNPrimeable(int[] a, int n) {
        int primeable = 1, sum = 0, i;
        if(a == null){
            return 1;
        }
        for (i = 0; i < a.length && primeable == 1; i++) {
            sum = a[i] + n;
            for (int j = 2; j < sum; j++) {
                if (sum % j == 0) {
                    primeable = 0;
                }
            }
        }
        return primeable;
    }
    public static void main(String[] args) {
        int[] a = {5, 15, 26};
        int n = 2;
        System.out.println(Primiable.isNPrimeable(a, n));
    }
}
