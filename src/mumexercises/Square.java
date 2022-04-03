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
public class Square {
     static int floorSqrt(int x) 
    { 
        // Base cases 
        if (x == 0 || x == 1) 
            return x; 
  
        // Staring from 1, try all numbers until 
        // i*i is greater than or equal to x. 
        int i = 1, result = 1; 
          
        while (result <= x) { 
            i++; 
            result = i * i; 
        } 
        return i - 1; 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
        int x = 12; 
        System.out.println(floorSqrt(x)); 
    } 
}
