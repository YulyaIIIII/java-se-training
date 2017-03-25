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
public interface UIAbstractFactory {
    public Breakfast getBreakfast();
    public Lunch getLunch();
    public Dinner getDinner();
    
}
