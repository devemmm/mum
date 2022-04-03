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
public class Visuvian {
     public static int vesuvian(int n)
        {
            int isVesuvian = 0;

            int paircount = 0;
            for (int i = 0; i < n && isVesuvian == 0; i++)
            {
                if (isPerfectSquare(i))
                {
                    for (int j = 0; j < n && isVesuvian == 0; j++)
                    {
                        if (isPerfectSquare(j))
                        {
                            if (i + j == n)
                                paircount++;
                            if (paircount == 2)
                                isVesuvian = 1;
                        }
                    }
                }
            }

            return isVesuvian;
        }
     
     static boolean isPerfectSquare(double x)  
    { 
        double sr = Math.sqrt(x); 
        return ((sr - Math.floor(sr)) == 0); 
    }
     
     public static void main(String[] args) {
        int n = 50;
         System.out.println(Visuvian.vesuvian(n));
    }
}
