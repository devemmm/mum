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
public class Question1 {

    public static int question1(int n) {
        int count = 0, sum = 0;
        
            for (int i = 0; i < n; i++) {
                count++;
                if (i == 2) {
                    sum = sum * i;
                }

            
        }

        return count / 2;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(question1(n));
    }
}
