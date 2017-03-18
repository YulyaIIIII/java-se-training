/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcfor;

import java.util.Scanner;
/**
 *
 * @author Andrew
 */
public class CalcFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println("Введите второе число: ");
        double b = in.nextDouble();
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));
        System.out.println("Частное: " + (a / b));
        System.out.println("Число 'а' в степени 'b': " + Math.pow(a, b));
        System.out.println("Квадратный корень числа 'а': " + Math.sqrt(a));
        System.out.println("Квадратный корень числа 'b': " + Math.sqrt(b));
        System.out.println("Корень степени 'a' из числа 'b': " + Math.pow(b, 1./a));
        System.out.println("Корень степени 'b' из числа 'a': " + Math.pow(a, 1./b));
        
        }
    
}
