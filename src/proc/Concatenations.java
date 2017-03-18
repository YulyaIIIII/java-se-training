/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenations;

public class Concatenations {

    public static void main(String[] args) {
        String s1 = "в недрах тундры ";  
        String s2 = "выдры в гетрах ";
        String s3 = "тырят в вёдра ядра кедров ";
        System.out.print(s1 + " ");
        System.out.print(s2 + " ");
        System.out.println(s3 + ".");
        String s4 = s1 + s3;
        String s5 = s3 + s2 + s1;
        String s6 = s1 + s2 + s3 + s5;
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
             
    }
    
}
