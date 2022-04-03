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
public class ValueTheSame {
    public static int allValuesTheSame(int[] a)
        {
            int isAllValues = 1;
            // if empty array set to 0 and don't enter the loop
            if (a.length == 0)
                isAllValues = 0;

            int first = 0, current = 0;
            for (int i = 0; i < a.length && isAllValues == 1; i++)
            {
                if (i == 0)
                    first = a[i];
                current = a[i];
                if (first != current) isAllValues = 0;
            }
            return isAllValues;
        }
    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, -1};
        System.out.println(allValuesTheSame(a));
    }
}
