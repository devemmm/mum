/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mumexercises;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class HourMinuteCompute {

    public static int[] computeHMS(int second){
        int hour = 0, minute = 0;
        if(second>3600){
            hour = second/3600;
            second = second - (hour*3600);
            if(second>=60){
                minute = second / 60;
                second = second - (minute * 60);
            }
        }
        else if(second<3600){
            hour = 0;
            minute = second/60;
            second = second - (minute * 60);
            
        }
        else if(second<60){
            hour = 0;
            minute = 0;
            second = second;
        }
        int[] result = {hour,minute,second};
        return result;
    }

    public static void main(String[] args) {
        int second = 0;
        int[] m= computeHMS(second);
        System.out.println("Hour: "+m[0]+" Minute: "+m[1]+" Second: "+m[2]);
    }
}
