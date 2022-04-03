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
public class Studying {
    public static int isLayered(int[] a, int n, int m){
        int current = 0, sequenced = 1;
        for(int i = 0; i<a.length && sequenced == 1; i++){
            current = a[i];
            if(i==0){
                if(current != n){
                    sequenced = 0;
                }
            }
            if(i == a.length-1){
                if(current != m){
                    sequenced = 0;
                }
            }
            if(i>0){
                if(current < a[i-1]){
                    sequenced = 0;
                }
            }
            if(i<a.length-1){
                if(current != a[i+1]){
                    if(a[i+1] != current + 1){
                        sequenced = 0;
                    }
                }
            }
        }
        return sequenced;
    }
    
    public static void main(String[] argh){
        int[] a = {1, 2, 3, 4, 5};
        int m = 1, n = 5;
        System.out.println(isLayered(a, n, m));
    }
    
}
