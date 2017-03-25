/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkk;

/**
 *
 * @author Andrew
 */
public class KKK {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Меню:");
            System.out.println("1. Украинская.");
            System.out.println("2. Татарская.");

            System.out.println("Выберите кухню:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '2');

    }
}
