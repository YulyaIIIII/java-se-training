/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lohica;

/**
 *
 * @author Andrew
 */
public class Lohica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println("a) true = " + (a | b));
        System.out.println("b) false = " + (a & b));
        System.out.println("c) false = " + (b & c));
        System.out.println("d) true = " + !(a & b));
        System.out.println("e) true = " + (a | !b));
        System.out.println("f) true = " + (a || (b && c)));
        System.out.println("g) true = " + (a || !(b && c)));
    }
}
