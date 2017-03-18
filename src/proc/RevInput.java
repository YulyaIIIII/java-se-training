/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revinput;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class RevInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ttt = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = ttt.nextInt();
        System.out.println("Введите второе число: ");
        int b = ttt.nextInt();
        System.out.println("Введите третье число: ");
        int c = ttt.nextInt();
        System.out.println();
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }

}
