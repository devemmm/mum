/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement;

/**
 *
 * @author User
 */
public class isFineArray {

    public static int isFineArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int found1 = 0;
            for (int j = 2; j < a[i] && found1 == 0; j++) {
                if (a[i] % j == 0) {
                    found1 = 1;
                }
            }
            if (found1 == 0) {
                for (int k = 0; k < a.length; k++) {
                    int found2 = 0;
                    for (int m = 2; m < a[k] && found2 == 0; m++) {
                        if (a[k] % m == 0) {
                            found2 = 1;
                        }
                    }
                    if (found2 == 0) {
                        if (a[i] - a[k] == 2 || a[k] - a[i] == 2) {
                            return 1;
                        }
                    }
                }
                return 0;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        int[] a = {3, 8, 15};
        System.out.println(isFineArray(a));
    }
}
