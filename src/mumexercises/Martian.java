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
public class Martian {
    public static int isMartian(int[] a)
        {
            int isMartian = 1;
            int oneCount = 0, TwoCount = 0;
            for (int i = 0; i < a.length && isMartian == 1; i++)
            {
                if (i < a.length - 1) 
                    {
                        if (a[i] == a[i + 1]){
                            isMartian = 0;
                        }
                    }
                if (a[i] == 1){ 
                    oneCount++;
                }
                else if (a[i] == 2) {
                    TwoCount++;
                }
                
            }
            if (oneCount <= TwoCount) isMartian = 0;
            return isMartian;
        }
    
    public static void main(String[] args) {
        int[] a= {1, 2, 1, 2, 1, 2, 1, 2, 1};
        System.out.println(isMartian(a));
    }
}
