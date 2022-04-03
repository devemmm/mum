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
public class Possibilities {

    public static int isAllPossibility(int[] a) {
        int n = a.length - 1, result = 1, count = 0;
        for (int i = 0; i < n && result == 1; i++) {
            int found = 0;
            for (int j = 0; j < a.length && found == 0; j++) {
                if (i == a[j]) {
                    found = 1;
                }
                else if(a[j]>n){
                    found = 1;
                    result = 0;
                }
            }
            if(found == 0)
                result = 0;
            
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 0, 3};
        System.out.println(Possibilities.isAllPossibility(a));
    }
}
