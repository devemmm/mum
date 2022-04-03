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
public class Hallow {

    static int isHollow(int a[]) {
        int precCnt = 0, zeroIndex = 0, zeroCnt = 0, result = 0;
        int followIndex = 0, followCnt = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                precCnt++;
            }
            if (a[i] == 0) {
                zeroIndex = i;
                break;
            }
        }

        for (int i = zeroIndex; i < a.length; i++) {
            if (a[i] == 0) {
                zeroCnt++;
            }
            if (a[i] != 0) {
                followIndex = i;
                break;
            }
        }
        

        for (int i = followIndex; i < a.length; i++) {
            if (a[i] != 0) {
                followCnt++;
            }
            if (a[i] == 0) {
                if (i <= a.length - 1) {
                    result = 0;
                } else {
                    break;
                }
            }
        }
        
        if (precCnt == followCnt && zeroCnt > 2) {
            return 1;
        }
        
        

        return 0;
    }

    public static void main(String args[]) {
        int a[] = {1,2,0,0,0,3,4,0};
        System.out.println(isHollow(a));
    }
}
