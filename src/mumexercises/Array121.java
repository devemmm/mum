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
public class Array121 {
    public static int is121Array(int a []){
        int count1 = 0, count2 = 0, result = 1, oneseq = 0, twoseq = 0, sum = 0, i;
        if(a[0] != 1 || a == null || a[a.length - 1] != 1)
            return 0;
        for(i = 0; i<a.length && result == 1; i++){
            if(a[i] != 1 || a[i] != 2){
                result = 0;
            }
            else if(a[i] == 1 && oneseq == 0){
                count1 ++;
            }
            else if(a[i] == 2 && twoseq == 0){
                count2 ++;
                oneseq = 1;
            }
            else if(a[i] == 1 && oneseq == 1){
                sum ++;
                twoseq = 1;
            }
            else{
                result = 1;
            }
        }
        if(count1 != sum){
            return 0;
        }
        else {
            return result;
        }
    }
    
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1, 1};
        System.out.println(Array121.is121Array(a));
    }
}
