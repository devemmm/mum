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
public class Adjacement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n[] = {1,1,1,1,1,2,1,1,1};
        System.out.println(Adjacement.largestAdjacentSum(n));
    }

    public static int largestAdjacentSum(int[] a) {
        int large = 0;
        for (int i = 0; i < a.length; i++) {
            int current = 0;
            int next = 0;
            current = a[i];
            if (i < a.length - 1) {
                next = a[i + 1];
            }
            int sum = current + next;
            if (sum > large) {
                large = sum;
            }
            
        }
        return large;
    }
}
