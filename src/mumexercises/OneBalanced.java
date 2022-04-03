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
public class OneBalanced {

    public static int isOneBalanced(int[] a) {
        int isOneBalanced = 1;

        int nonOneSequence = 0, oneSequence = 0;
        int firstOneSquenceCount = 0, secondOneSquenceCount = 0, nonOneSquenceCount = 0;

        for (int i = 0; i < a.length && isOneBalanced == 1; i++) {
            int current = a[i];
            if (current == 1) {
                if (oneSequence == 0 && nonOneSequence == 0) {
                    oneSequence++;
                    if (firstOneSquenceCount == 0) {
                        firstOneSquenceCount++;
                    }
                } else {
                    if (nonOneSequence == 0) {
                        if (oneSequence == 1) {
                            firstOneSquenceCount++;
                        }
                        if (oneSequence == 2) {
                            secondOneSquenceCount++;
                        }
                    } else {
                        if (nonOneSequence == 1 && oneSequence == 1) {
                            oneSequence++;
                        }

                        if (oneSequence == 2 || nonOneSequence == 1) {
                            secondOneSquenceCount++;
                        }

                    }
                }
            } else {
                if (nonOneSequence == 0) {
                    nonOneSequence++;
                    if (nonOneSquenceCount == 0) {
                        nonOneSquenceCount++;
                    }

                } else {
                    if (oneSequence == 1 || oneSequence == 0) {
                        nonOneSquenceCount++;
                    }
                    if (oneSequence == 2) {
                        isOneBalanced = 0;
                    }
                }
            }
        }

        if (firstOneSquenceCount + secondOneSquenceCount != nonOneSquenceCount) {
            isOneBalanced = 0;
        }
        return isOneBalanced;
    }
    
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 1, -18, 26, 1};
        System.out.println(OneBalanced.isOneBalanced(a));
    } 
}

