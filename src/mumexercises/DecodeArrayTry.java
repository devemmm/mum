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
public class DecodeArrayTry {
    
    public static int[] encodeArray(int n){
        int index = 0, count = 0, orgN = n, temp = 0;
//        if(n<=0){
//            ;
//        }
//        System.err.println(n);
        while(n >= 1){
            temp = n%10;
            n = n / 10;
            if(temp == 0){
                index++;
            }
            else{
                for(int i = 0; i<=temp; i++){
                    index++;
                }
            }
            
        }
        
        
        int[] result = new int[index];
        n = orgN;
        int k = 0;
        
        while(n>=1){
            temp = n%10;
            if(temp == 0){
                result[k] = 1;
                k++;
            }
            else{
                for(int i = 0; i<temp; i++){
                    result[k] = 0; 
                    k++;
                }
                result[k]=1;
                k++;
                
            }
            n = n/10;
        }
        return result;
    }  
    
    public static void main(String[] argh){
        int n = 100001;
        int[] result = encodeArray(n);
        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }
        
    }
}
