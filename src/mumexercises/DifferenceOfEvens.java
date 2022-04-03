/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mumexercises;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DifferenceOfEvens {

    public static int largestDifferenceOfEvens(int[] a) {
        int min = 0, max = 0, count = 0, different = 0, result = 2;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (count == 0) {
                    max = a[i];
                    min = a[i];
                }
                count++;
                if (a[i] > max) {
                    max = a[i];
                }
                if (a[i] < min) {
                    min = a[i];
                }
            }
        }
        if(count < 2){
            return -1;
        }
        else{
            different = max - min;
            return different;
        }
        
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 1, 4, 1, 6, 4};
        System.out.println(DifferenceOfEvens.largestDifferenceOfEvens(a));
    }

}
