/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.ArrayList;

/**
 *
 * @author trung.nguyen
 */
public abstract class User {
    protected Account account;
    
    public Account getAcount() {
        return account;
    }

    public void setAcount(Account acount) {
        this.account = acount;
    }
    public abstract void checkbalance();
    public abstract void withdrawCash(int money);
    public abstract void transferFunds(double money, double reAccountname);
    public abstract String printBill();
    
    protected static void login(String user, String password, ArrayList<User> list){
        int ok = 0;
        for (int i = 0; i < list.size(); i++) {
             if (user.equals(list.get(i).getAcount().getAccountName()) && password.equals(list.get(i).getAcount().getPassword())) {
                Show.showMenu(list.get(i));
                ok = 1;
                break;
             }           
        }
        if(ok == 0){
            System.out.println("Wrong Account name or Password!!! Please check again");
            Show.loginScreen();
        }
    }
    
    protected void logout(User a){
        a = null; 
        System.out.println("♥♥♥ Thanks for using our service ♥♥♥");
        Show.showLogin();
    }
    
    public abstract String getName();
}
