/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mumexercises;

import static mumexercises.DecodeNumber.decodeArray;

/**
 *
 * @author User
 */
public class DecodedNumber2 {

    public static int decodeArray(int[] a) {
        int zero = 0, positive = 1, decode = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i]<0)
                positive = -1;
            if(a[i] == 0){
                zero++;
            }
            else{
                if(zero>0){
                    decode = decode *10 +zero;
                    zero = 0;
                }
                else{
                    decode = decode * 10;
                }
            }
        }
        decode = decode * positive;
        return decode;
    }
    
    public static void main(String[] args) {
        int[] a = {0, 1, 1, 1, 1, 1, 0, 1};
        System.out.println(decodeArray(a));
    }
}
