/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dzkratnoe3m;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class DZKratnoe3M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        Scanner zzz = new Scanner(System.in);
        int i = zzz.nextInt();
        int j = zzz.nextInt();
        while (i <= j) {
            System.out.print(i++ + " ");
            //sum = i - 1 + sum;
        }
        if (i % 3 == 0){
                System.out.print(sum);
            }
        System.out.println();
        System.out.println(sum);

    }

}
