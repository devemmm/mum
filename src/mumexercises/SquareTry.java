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
public class SquareTry {
    public static int isSquare(int n){
        int result = 0;
        if(n<0){
            return 0;
        }
        for(int i = 1; i<n && result == 0; i++){
            if(i * i == n){
                result = 1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 8;
        System.out.println(isSquare(n));
    }
}
