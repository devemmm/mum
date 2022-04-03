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
public class PairWise {
    public static void main(String[] args){
        int sum = 0, i;
        int[] a = {2, 1, 18};
        if(a == null || a.length % 2 != 0){
            return ;
        }
        sum = a.length / 2;
//        System.out.println(sum);
        int calc = 0, j = 0;
        int[] result = new int[sum];
        for(i = 0; i < a.length; i = i+2){
            calc = a[i] + a[i + 1];
            result[j] = calc;
            j++;
        }
        
        for(int k = 0; k<sum; k++){
            System.out.println(result[k]);
        }
    }
    
//    public static void main(String[] args) {
//        int[] a = {2, 1, 18, -5};
//        int sum = a[a.length - 1] / 2;
//        for(int i = 0; i<= sum; i++){
//            System.out.println(PairWise.pairwiseSum(a));
//        }
//    }
}
