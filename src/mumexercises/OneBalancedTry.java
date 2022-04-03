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
public class OneBalancedTry {

    static int isOneBalanced(int[] a) {
        int onePrecedent = 0, nonOnes = 0, oneFollow = 0, oneSequence = 0, nononeSequence = 0, result =1;
        for (int i = 0; i < a.length && result == 1; i++) {
            if (a[i] == 1) {
                if (oneSequence == 0) {
                    oneSequence = 1;
                }
                onePrecedent ++;
                if(nononeSequence == 1){
                    if(i != a.length - 1){
                        result = 0;
                    }
                }
            }
            else{
                if(a[i] != 1){
                    if(nononeSequence == 0){
                        nononeSequence = 1;
                    }
                    nonOnes++;
                }
            }
        }
        
        if(result == 1){
            if(onePrecedent != nonOnes){
                result = 0;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 1, 1};
        System.out.println(OneBalancedTry.isOneBalanced(a));
    }
}
