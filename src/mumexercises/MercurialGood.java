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
public class MercurialGood {
    public static int isMarcurial(int[] a) {
        int oneFirst = 0, non = 0, threeFound = 0, result = 1, oneSecond = 0;
        for (int i = 0; i < a.length && result == 1; i++) {
            if(a[i] ==1){
                if(oneFirst == 0){
                    oneFirst = i;
                }
                else{
                    if(threeFound != 0){
                        oneSecond = i;
                        if(oneFirst < threeFound && threeFound < oneSecond){
                            result = 0;
                        }
                    }
                }
            }
            if(a[i] == 3){
                if(oneFirst!= 0){
                    threeFound = i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 10, 3, 15, 1, 2, 2};
        System.out.println(isMarcurial(a));
    }
}
