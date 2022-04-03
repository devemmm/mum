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
public class SameNumber {
    public static int sameNumberOfFactors(int n1, int n2){
        if(n1<0 || n2<0)
            return -1;
        int count1 = 0, count2 = 0,result =1;
        for(int i = 1; i<=n1; i++){
            if(n1%i == 0){
                count1++;
            }
        }
        
        
        for(int i = 1; i<=n2 && result == 1; i++){
            if(n2%i == 0){
                count2++;
            }
            if(count2>count1)
                result = 0;
        }
        return result;
        
    }
    
     public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
         System.out.println(SameNumber.sameNumberOfFactors(n1, n2));
    }
}
