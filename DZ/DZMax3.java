/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dzmax3;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class DZMax3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("First number:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Second number:");
        int b = in.nextInt();
        System.out.println("Third number:");
        int c = in.nextInt();
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
