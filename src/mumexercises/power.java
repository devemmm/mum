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
public class power {
    public static int WithoutMath(int a, int b){
        int result = 1;
        for(int i = 1; i<=b; i++){
            result = a * result;
        }
        return result;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 5; 
        System.out.println(WithoutMath(a, b));
    }
}
