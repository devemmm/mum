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
public class Triangular {

    public static int isTriangular(int n) {
        int isTriangular = 0;

        int sum = 0, j=0;

        for (j = 0; j <= n && isTriangular == 0; j++) {
            sum = sum + j;
            if (sum == n) {
                isTriangular = 1;
            }
        }

        return isTriangular;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(Triangular.isTriangular(n));
    }
}
