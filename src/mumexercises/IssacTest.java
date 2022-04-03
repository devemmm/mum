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
public class IssacTest {

    public static int isMartian(int[] a) {
        int one = 0, two = 0, result =1;
        for(int i = 0; i<a.length && result == 1; i++){
            if(i != 0){
                if(a[i] == a[i-1]){
                    result = 0;
                }
            }
            if(a[i] == 1){
                one++;
            }
            if(a[i] == 2){
                two++;
            }
        }
        if(result == 1){
        if(one > two){
            result = 1;
        }
        else{
            result =0;
        }
        }
        else{
            result = 0;
        }
        return result;
        
    }

    public static void main(String[] args) {
        int[] a = {1,3};
        System.out.println(isMartian(a));
    }
}
