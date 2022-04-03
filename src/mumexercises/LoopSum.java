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
public class LoopSum {

    public static int loopSum(int[] a, int n) {
        int sum = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (k < a.length) {
                sum = a[k] + sum;
                k++;
            }
            else{
                k = 0;
                sum = a[k] + sum;
                k++;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int n = 2;
        System.out.println(loopSum(a, n));
    }

}
