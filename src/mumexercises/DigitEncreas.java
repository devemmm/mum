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
public class DigitEncreas {

    public static int isDigitIncreasing(int n) {
        int r= 0, temp = 0, tempn = n, count = 0, result = 0;
        while(n>0){
            temp = n%10;
            count++;
            n = n/10;
        }
        for(int i = 1; i<10 && result == 0; i++){
            int sum = 0;
            int tempsum = 0;
            for(int j = 1; j<=count; j++){
                sum = sum * 10 +i;
                tempsum = tempsum + sum;
            }
            System.out.println(sum);
            if(tempsum == tempn){
                result =1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 36;
        System.out.println(isDigitIncreasing(n));
    }
}
