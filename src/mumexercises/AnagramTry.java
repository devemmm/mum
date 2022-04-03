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
public class AnagramTry {

   public static int isAnagram(char[] str1, char[] str2){
       int n1 = str1.length, n2 = str2.length, found = 0, result = 1;
       char current;
       if(n1 != n2)
           result = 0;
       for(int i = 0; i<n1 && result == 1; i++){
           current = str1[i];
           found = 0;
           for(int j = i; j<n2 && found == 0; j++){
               if(current == str2[j]){
                   found = 1;
                   System.out.println(current);
               }
           }
           if(found == 0){
               result = 0;
           }
       }
       return result;
   }

    public static void main(String[] args) {
       
        char[] str1 = {'s', 'i', 't'} ;
        char[] str2 = {'i', 't', 's'};
        int result = isAnagram(str1, str2);
        System.out.println(result);
    }
}
