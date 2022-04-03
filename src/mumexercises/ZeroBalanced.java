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
public class ZeroBalanced {
    public static int isZeroBlanced(int[] a){
        int next = 0, sum = 0, result = 0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        if(sum == 0){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public static void main(String[] args) {
        int[] a= {3, -3, -3};
        System.out.println(isZeroBlanced(a));;
    }
}
