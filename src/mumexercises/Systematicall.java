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
public class Systematicall {
    public static int isSystematicalIncrease(int[] a){
        
       int result = 1, k = 0;
       int index = a[a.length-1];
       if(index ==1){
           if(a.length != 1){
               return 0;
           }
       }
       for(int i = 1; i<=index && result == 1; i++){
           for(int j = 1; j<=i; j++){
               //System.out.println(j);
               if(a[k] != j){
                   result = 0;
               }
               else{
                   k++;
               }
           }
       }
       return result;
    }
    

    public static void main(String[] argh){
        int[] a = {1, 1, 2, 1, 2};
        System.out.println(isSystematicalIncrease(a));
    }
}
