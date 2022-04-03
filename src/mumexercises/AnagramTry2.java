/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mumexercises;

import static mumexercises.AnagramTry.isAnagram;

/**
 *
 * @author User
 */
public class AnagramTry2 {

    public static int isAnagram(char[] str1, char[] str2) {
        int n1 = str1.length, n2 = str2.length, found = 0, result = 1, count1 = 0,  count2 = 0;
        char current;
        if (n1 != n2) {
            return 0;
        }
        
        for(int i = 0; i<n2 && result == 1; i++){
            current = str1[i];
            for(int j = 0; j<n1; j++){
                if(current == str1[j]){
                    count1++;
                }
            }
            
            for(int j = 0; j<n1; j++){
                if(current == str2[j]){
                    count2++;
                }
            }
            
            if(count1 != count2){
                result = 0;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
       
        char[] str1 = {'s', 'i', 't'}  ;
        char[] str2 = {'i', 't', 't'} ;
        int result = isAnagram(str1, str2);
        System.out.println(result);
    }
}
