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
public class Hodder {

    public static int isHodder(int n) {
        int result = 0, found = 0, answer = 0;
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("It's not Prime number");
                return 0;
            }
        }
        System.out.println("It is Even number");

        for (int j = 2; j < 10 && result == 0; j++) {
            for (int i = 2; i < j; i++) {
                found =0;
                if (j % i == 0) {
                    found = 1;
                }
            }
            answer = 0;
            if(found == 0){
                answer = 2;
                for(int k = 1; k<j; k++){
                    answer = answer * 2;
                }
                System.out.println("For j = "+j+" = "+answer);
            }
            
            if(answer - 1 == n){
                result =1;
                
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(isHodder(n));
    }
}
