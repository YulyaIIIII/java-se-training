/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dzkratnoe3for;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class DZKratnoe3for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        Scanner zzz = new Scanner(System.in);
        int i = zzz.nextInt();
        int j = zzz.nextInt();
        for (; i <= j; i++) {
            System.out.print(i + " ");
            //sum = sum + i;
            if (i % 3 == 0) {
                sum = sum + i;
            }
        }
        
        System.out.println();
        System.out.println(sum);
    }
}
