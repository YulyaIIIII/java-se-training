/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dzdistance;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class DZDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int firstauto = 50;
            int secondauto = 30;
            int s0 = 80;
                
        System.out.println("Скорость первого автомобиля - " + firstauto + " км/час. "
                + "Скорость второго автомобиля - " + secondauto + " км/час.");
        System.out.println("Расстояние между автомобилями - " + s0 + " км. "
                + "Автомобили движутся в разные стороны.");
        System.out.println("Расстояние между автомобилями через"
                + "(введите целое число): ");
          
        Scanner in = new Scanner(System.in);
            double t = in.nextDouble();
        System.out.print("час. равно: ");
        System.out.println(firstauto*t + secondauto*t + s0 + " км.");
    }
    
}
