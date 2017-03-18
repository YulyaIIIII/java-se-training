/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myperson;

import java.util.Arrays;

/**
 *
 * @author Andrew
 */
public class MyPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person [] ktozdes = {
            new Person ("Anya", 23),
            new Person ("Tolya", 23),
            new Person ("Dasha", 23),
            new Person ("Zoya", 23),
            new Person ("Katya", 23),
                    
        };
        Arrays.sort(ktozdes);
        String line = Arrays.toString(ktozdes);
        System.out.println(line);
    }
    
}
