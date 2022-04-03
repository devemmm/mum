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
public class LenghtCharacter {

    public static char[] lengCharacter(char[] a, int stat, int end) {
        if (stat > a.length || end > a.length || stat == end || end - stat < 0 || a == null) {
            return null;
        }
        char[] result = new char[end];
        int k = 0;
        for (int i = stat; i < end; i++) {
            result[k] = a[stat];
            k++;
            System.out.println(result[k]);
        }

        return result;

    }

    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c'};
        int stat = 0, end = 2;
        char[] result = lengCharacter(a, stat, end);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
