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
public class Concatenated {

    public static int checkConcatenatedSum(int n, int catlen) {
        int isConcatenatedSum = 1;
        int sum = 0, tempn = n;
        do {
            int lastdigit = tempn % 10;
            int tempsum = 0;
            int tens = 1;
            for (int i = 1; i <= catlen; i++) {
                tempsum =tempsum + (tens * lastdigit);
                tens = tens * 10;
            }
            tempn = tempn / 10;
            sum += tempsum;
        } while (tempn >= 1);
        if (sum != n) {
            isConcatenatedSum = 0;
        }
        return isConcatenatedSum;
    }
    public static void main(String[] args) {
        int a =198;
        int c=3;
        System.out.println(Concatenated.checkConcatenatedSum(a, c));
    }

}
