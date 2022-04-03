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
public class LargestAdjacentSun1 {
    public static int largestadjacentsum(int[] a){
        int result = 0, sum = 0;
        for(int i = 0; i<a.length - 1; i++){
            sum = a[i] + a[i+1];
            if(result < sum){
                result = sum;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        System.out.println(largestadjacentsum(a));
    }
}
