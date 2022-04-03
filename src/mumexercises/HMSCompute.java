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
public class HMSCompute {
    private static int[] computesHMS(int second) {
		// TODO Auto-generated method stub
		int hour = 0;
		int minute = 0;
		int sec = 0;
		if (second >= 3600) {
			hour = second / 3600;
			second = second - hour * 3600;
			if (second >= 60) {
				minute = second / 60;
				second = second - minute * 60;
				if (second < 60) {
					sec = second;
				}
			} else if (second < 60) {
				minute = 0;
				sec = second;
			}
		} else if (second < 3600 && second >= 60) {
			hour = 0;
			minute = second / 60;
			second = second - minute * 60;
			if (second < 60) {
				sec = second;
			}
		} else if (second < 60) {
			hour = 0;
			minute = 0;
			sec = second;
		}
		int[] hms = new int[]{hour, minute,sec};
		return hms;
	}
    public static void main(String[] args) {
		
		int second = 3735;
		
		if (second < 0) {
			System.out.println("The seconds can not be negative.");
		} else {
			int[] hms = computesHMS(second);
			
			System.out.println("Hour: " + hms[0] + " Minute: " + hms[1] + " Second: " + hms[2]);
		}
	}
}
