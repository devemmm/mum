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
public class Mercurial {

    public static int isMarcurial(int[] a) {
        int isMercurial = 1;

        int firstone = -1, secondone = -1, firstthree = -1;
        for (int i = 0; i < a.length && isMercurial == 1; i++) {
            int current = a[i];
            if (current == 1) {
                if (firstthree == -1) {
                    firstone = i;
                } else {
                    if (firstthree != -1) {
                        secondone = i;
                        if (firstthree != -1 && firstone != -1 && secondone != -1) {
                            if (firstone < firstthree && firstthree < secondone) {
                                isMercurial = 0;
                            }
                        }
                    }
                }
            } else if (current == 3) {
                if (firstone != -1) {
                    firstthree = i;
                }
            }
        }

        if (firstthree != -1 && firstone != -1 && secondone != -1) {
            if (firstone < firstthree && firstthree < secondone) {
                isMercurial = 0;
            }
        }

        return isMercurial;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 18, 1, 0, 3, -11, 1, 3};
        System.out.println(Mercurial.isMarcurial(a));
    }

}
