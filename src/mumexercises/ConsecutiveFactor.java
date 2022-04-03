/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mumexercises;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ConsecutiveFactor {

    public static int isonsecutive(int n) {
        if (n <= 0) {
            return 0;
        }
        int result = 0;
        for (int i = 2; i < n && result == 0; i++) {
            if (n % i == 0) {
                int j = (i + 1);
                if (n % j == 0) {
                    result = 1;
                }

            }
            
        }
        return result;
      
    }

    public static void main(String[] args) {
        int n = 105;
        System.out.println(isonsecutive(n));
    }
}
