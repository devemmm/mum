/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mumexercises;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CountOnes {

    public static int countOnes(int n) {
        int count = 0, temp = 0;
        while (n > 0) {

            temp = n % 2;
            if (temp == 1) {
                count++;
            }
            n = n / 2;
        }
        return count;

    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(countOnes(n));
    }
}
