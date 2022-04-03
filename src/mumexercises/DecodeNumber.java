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
public class DecodeNumber {
    public static int decodeArray(int[] a){
        int next = 0, current = a[0], decode = 0, temp = 0;
        int sign = 0;
        if(current < 0){
            sign = -1;
        }
        else{
            sign = 1;
        }
        for(int i=0; i<4; i++){
            next = a[i+1];
            decode = current - next;
            if(decode < 0)
                decode = -1 * decode;
            temp = temp * 10 + decode;
            current = next;
        }
        temp = temp * sign;
        return temp;
    }
    
    public static void main(String[] args) {
        int[] a = {-1, 5, 8, 17, 15};
        System.out.println(decodeArray(a));
    }
}