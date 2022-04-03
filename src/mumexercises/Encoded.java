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
public class Encoded {

    public static int[] encodeArray(int n){
        int i = 2, count = 0, pfNum = 0, k = 0;
        //int[] result;
        int orgN = n;

        while (n != 1) {
            while (n % i == 0) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 1) {
                    pfNum++;
                }
                count = 0;
                n = n / i;
            }
            i++;
        }
       // System.err.println(pfNum);

        int[] result = new int[pfNum];
        n = orgN;
        i = 2;

        while (n != 1) {
            while (n % i == 0) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {

                        count++;
                    }
                }
                if (count == 1) {
                    result[k] = i;
                    k++;

                }
                count = 0;
                n = n / i;
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        
        int n = 1200;
        int[] result = encodeArray(n);
        for (int l = 0; l < result.length; l++) {
            System.out.print(result[l]+" ");
        }
    }

}
