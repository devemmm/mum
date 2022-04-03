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
public class ClosestFibonac {

    public static int closestFibonacci(int n) {
        int n1 = 0, n2 = 1, n3 = 0, result = 0;
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if(n3>=n){
                return n1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 34;
        System.out.println(ClosestFibonac.closestFibonacci(n));
        int n1 = 0, n2 = 1, n3 = 0;
//        for (int i = 2; i < n; i++) {
//            n3 = n1 + n2;
//             System.out.println(n3);
//            n1 = n2;
//            n2 = n3;
//        }
    }
}
