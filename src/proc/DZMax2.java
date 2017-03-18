/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dzmax2;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class DZMax2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
                //if (a > b) 
            //System.out.println(a);
        //else 
            //System.out.println(b);
        System.out.println(Math.max(a, b));
    }
}
