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
public class EncodeArray {

    public static int[] encodedArray(int n){
        int count = 0, orgN = n, index = 0;
        int temp = 0;
        if(n<0){
            index++;
            n=n*-1;
        }
        
        
        //Counting the length of array of a given input number
        while(n>=1){
            temp = n%10;
            if(temp == 0){
                count++;
                index ++;
            }
            else if(temp != 0){
                index++;
                for(int i = 1; i<=temp; i++){
                    index++;
                }
            }
            n= n/10;
            
        }
        
        //After Getting size of array for a givven number
        n= orgN;
        int[] result = new int[index];
        int k = 0;
        
        
        if(n<0){
            result[k] = -1;
            n = n *-1;
            k++;
        }
        while(n>=1){
            temp = n%10;
            if(temp == 0){
                result[k] = 1;
            }
            else if(temp != 0){
                for(int i = 1; i<=temp; i++){
                    result[k] = 0;
                    k++;
                }
                result[k] = 1;
                
            }
            n= n/10;
            k++;
            
        }
        return result;
    }

    public static void main(String[] args) {
        int n = -1;
        
        int[] m = encodedArray(n);
        for(int i = 0; i<m.length; i++){
            System.out.println(m[i]);
        }
        
    }
}
