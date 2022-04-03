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
public class DifferentEvenTry {
    
    public static int largestDifferenceOfEvens(int[ ] a){
        int max = 0, min = 0, differ = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] % 2 == 0){
                if(max < a[i]){
                    max = a[i];
                }
            }
            
            if(a[i] % 2 == 0){
                if(min == 0){
                    min = a[i];
                }
                if(a[i]<min){
                    min = a[i];
                }
            }
            
            if(i == a.length - 1 && max ==0 && min ==0){
                return -1;
            }
            
            
            
        }
        System.err.println("Max = :"+max);
            System.err.println("Min = :"+min);
        differ = max - min;
        return differ;
    }
    
    public static void main(String[] args) {
        int[] a={2, 2, 2, 2};
        System.out.println(largestDifferenceOfEvens(a));
    }
}
