/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayofweek;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class DayOfWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String m = "monday";
        String t = "tuesday";
        String w = "wednesday";
        String th = "thursday";
        String f = "friday";
        String sa = "saturday ";
        String su = "sunday";
        String r = "Today is ";
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        if (day == 1){
            System.out.println(r + m + ".");
        } else if (day == 2) {
            System.out.println(r + t + ".");
        } else if (day == 3) {
            System.out.println(r + w + ".");
        } else if (day == 4) {
            System.out.println(r + th + ".");
        } else if (day == 5) {
            System.out.println(r + f + ".");
        } else if (day == 6) {
            System.out.println(r + sa + ".");
        } else if (day == 7) {
            System.out.println(r + su + ".");
        } else {
            System.out.println("error");
        }
    }
    
}
