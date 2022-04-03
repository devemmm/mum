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
public class Mileage {

    public static void main(String[] args) {
        int[] a = {8, 9, 9, 5, 0};
        int miles = 1;
        for (int i = 1; i <= miles; i++) {
            UpdateMiles(a, 1, 0);
        }
        for(int j = 0; j<a.length; j++){
            System.out.println(a[j]);
        }
    }

    private static void UpdateMiles(int[] a, int mile, int index) {
        
        if (index < a.length) {
            int current = a[index];
            if (current + mile == 10) {
                a[index] = 0;
                UpdateMiles(a, mile, index + 1);
            } else {
                a[index] = current + mile;
            }
        }
    }

//    public static void main(String[] args) {
//        int[] a = {8, 9, 9, 5, 0};
//        int miles = 1;
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(Mileage.updateMileagecounter(a, miles));
//        }
//    }
}
