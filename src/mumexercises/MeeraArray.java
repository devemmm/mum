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
public class MeeraArray {
    public static int isMeeraArray(int[] a){
        int even = 0, countLast = 0, odd = 0, result = 1, found = 1, evenSequences = 0;
        if(a.length == 0){
            return 0;
        }
        
        for(int i=0; i<a.length && result == 1; i++){
            if(i==0 && a[i]%2!=0){
                result = 0;
            }
            
            else if(a[i] % 2 == 0 && evenSequences == 0){
                even++;
            }
            else if(a[i] % 2 != 0 && evenSequences == 0){
                evenSequences = 1;
                odd = 1;
                for(int j = a.length - 1; j>i && found == 1; j--){
                    if(a[j] % 2 == 0){
                        countLast++;
                    }
                    else{
                        found = 0;
                    }
                }
            }
        }
        
        if(odd == 0 || even != countLast){
            result = 0;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] a = {2,2,2,4,4};
        System.out.println(isMeeraArray(a));
    }
}
