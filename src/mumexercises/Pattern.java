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
public class Pattern {

    public static int matchPattern(int[] a, int[] pattern) {

        // len is the number of elements in the array a, patternLen is the number of elements in the pattern.
        int len = a.length;
        int patternLen = pattern.length;
        int i = 0; // index into a
        int k = 0; // index into pattern
        int matches = 0;  // how many times current pattern character has been matched so far

        for (i = 0; i < len; i++) {

            if (a[i] == pattern[k]) {
                matches++;   // current pattern character was matched
            } else if (matches == 0 || k == patternLen - 1) {
                return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
            } else {
                k++;
                if (a[i] == pattern[k]) {
                    matches++;
                } else {
                    return 0;
                }

            } // end of else

        } 

            // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
        if (i == len && k == patternLen - 1) {
            return 1;
        } else {
            return 0;
        }

    }
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 2};
        int[] pattern = {1, 2};
        System.out.println(matchPattern(a, pattern));
    }

}
