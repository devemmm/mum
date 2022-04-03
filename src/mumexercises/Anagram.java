/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mumexercises;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Anagram {
    static int areAnagram(char[] str1, char[] str2) 
    { 
        // Get lenghts of both strings 
        int n1 = str1.length; 
        int n2 = str2.length; 
        if (n1 != n2) 
            return 0; 
        Arrays.sort(str1); 
        Arrays.sort(str2); 
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return 0; 
  
        return 1; 
    } 
  
    public static void main(String args[]) 
    { 
        char str1[] = { 't', 'e', 's', 't' }; 
        char str2[] = { 't', 't', 'e', 'w' }; 
        int m = areAnagram(str1, str2);
        System.out.println(); 
        
    } 
    
}
