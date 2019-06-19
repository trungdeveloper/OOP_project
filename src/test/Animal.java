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
public class Animal extends Object{
    private int hight;

    public Animal(int hight) {
        this.hight = hight;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
    
    public void speak(){
        System.out.println("animal");
    }
}
