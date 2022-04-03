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
public class Centered {
    
    public static int isCentered(int[] a){
        if(a == null || a.length % 2 == 0){
            return 0;
        }
        if(a.length == 1){
            return 1;
        }
        
        int leng = 0, middle = 0, result = 1;
        leng = a.length;
        
        
        int n = leng / 2;
        middle = a[n++];
        
        for(int i = 0; i<a.length && result == 1; i++){
            if(middle > a[i] || middle == a[i]){
                result = 0;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] a = {10};
        System.out.println(isCentered(a));
    }
}
