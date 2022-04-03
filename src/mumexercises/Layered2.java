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
public class Layered2 {
    public static int layered(int[] a){
        
            if (a.length == 0)
            {
                return 0;
            }
            int previous = a[0];
            int count = 0;
            for (int i = 0; i < a.length; i++)
            {
                if (previous == a[i])
                {
                    count++;
                   // Console.WriteLine("A[i] = {0} COUNT ={1} COUNT", a[i],count);
                }
                else if (count < 2 || previous > a[i])
                {
                    return 0;
                }
                else
                {
                    previous = a[i];
                    count = 1;
                }
            }
            if (count < 2)
            {
                return 0;
            }
            else
            {
                return 1;
            }
    }
    
    public static void main(String[] args) {
        int[] a={1, 2, 2, 2, 3, 3};
        System.out.println(layered(a));
    }
}
