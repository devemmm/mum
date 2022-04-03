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
public class PerfectSquare {
    static boolean isPerfectSquare(int n) 
    { 
        for (int i = 1; i * i <= n; i++) { 
  
            // If (i * i = n) 
            if ((n % i == 0) && (n / i == i)) { 
                return true; 
            } 
        } 
        return false; 
    } 
  
    public static void main(String[] args) 
    { 
  
        int n = 36; 
  
        if (isPerfectSquare(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
}
