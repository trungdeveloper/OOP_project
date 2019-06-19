/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author trung.nguyen
 */
public class Dog extends Animal{

    public Dog(int hight) {
        super(hight);
    }
    
    @Override
    public void speak(){
        System.out.println("Dog");
    }
    
    public static void main(String[] args) {
        Object s1 = new Dog(10);
//        s1.setHight(11);
//        System.out.println(s1.getHight());
    }
}
