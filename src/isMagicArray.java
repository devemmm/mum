/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement;

/**
 *
 * @author User
 */
public class isMagicArray {

    public static int isMagicArray(int[] a) {
        int n = a[0];//we know that the first element of array is on 0 index
        if (n == 0) {//Condition said that when first element is 0, the less elements in array must not be prime
            
            //Checking if there's a prime elements
            for (int i = 1; i < a.length; i++) {
                int sign = 0;
                for (int j = 2; j < a[i] && sign == 0; j++) {
                    if (a[i] % j == 0) {
                        sign = 1;//Program stop when a number is not a prime
                    }
                }
                if (sign == 0) {// Because sign that show the number is prime must not equal to 0, we should return 0
                    //Because starting element is 0, there should not be a prime element.
                    return 0;
                }
            }
            //Program must return 1 if there's no prime elements in array
            return 1;
            

        } else {//Program will continue here if first element is not 0
            //We are going to check the Sum of prime elements in Array
            
            int sum = 0;
            //Checking all Prime element in array
            for (int i = 0; i < a.length; i++) {// Because also first element is included, we start for 0 index
                int found = 0, k = 2;
                //Formula to check prime number
                for (k = 2; k < a[i] && found == 0; k++) {
                    if (a[i] % k == 0) {
                        found = 1;
                    }
                }
                //When program exit from looping with found=0, means the element in a[i] is prime
                if (found == 0 && a[i]>0) {
                    sum = sum + a[i];
                }
            }
            if (n == sum) {
                return 1;
            }
            else {
                return 0;
            }
        }
        
    }
    
    public static void main(String[] args) {
        int a[]= {21, 3, 7, 9, 11, 4, 6};
        System.out.println(isMagicArray(a));
    }
}
