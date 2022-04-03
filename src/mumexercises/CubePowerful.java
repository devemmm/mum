/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.int 
 */

package mumexercises;

/**
 *
 * @author User
 */
public class CubePowerful {
    public static int isCubePowerful(int n){
        int temp = 0, r = 0, tempn = n;
        if (n<=0)
            return 0;
        while (n>0){
            temp = n%10;
            r= r + cube(temp);
            n=n/10;
        }
        if (tempn == r)
            return 1;
        else
            return 0;
        
    }
    
    public static int cube(int b){
        int sum=1;
        for(int i=1; i<=3; i++){
            sum = sum * b;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n=-87;
        System.out.println(CubePowerful.isCubePowerful(n));
    }
    
}
