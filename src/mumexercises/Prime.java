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
public class Prime {

    public static int prime(int n) {

        int result = 0;
        for(int i = 1; i<n; i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(prime(n));

    }
}
