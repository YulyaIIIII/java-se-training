/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package like;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Like {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String X = in.nextLine();
        String Y = in.nextLine();
        String result = "I like " + X + " because of " + Y + ".";
        System.out.println(result);
    }
    
}
