/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myperson;

/**
 *
 * @author Andrew
 */
public class Person {
    String name;
   int age;
   Person (String name, int age){
       this.name = name;
       this.age = age;
   }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int compareTo(Object t) {
        Person other = (Person)t;
        if (other.getAge() == this.getAge()) {
            return 0;
        } else if (other.getAge() > this.getAge()) {
            return -1;
        } else {
            return 1;
        } 
    }
}
