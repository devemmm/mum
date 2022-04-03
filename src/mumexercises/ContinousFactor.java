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
public class ContinousFactor {
    public static int isContinuousFactored(int  n){
        int sum = 1, result = 0;
        for(int i = 1; i<n && result == 0; i++){
            if(n%2 == 0){
                sum = sum*i;
            }
            if(sum == n){
                result = 1;
            }
            else if(sum > n){
                return 0;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 99;
        System.out.println(isContinuousFactored(n));
    }
}
