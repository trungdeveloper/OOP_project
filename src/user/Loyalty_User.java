/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author trung.nguyen
 */
public class Loyalty_User extends Common_User{

    public Loyalty_User(String name, Account account) {
        super(name, account);
    }
    
    protected void changePass(String pass){
        this.getAcount().setPassword(pass);
    }
    
    @Override
    public void withdrawCash(int money){
        account.setBalance(account.getBalance() - money - 1000);
        System.out.println(account.getBalance());
    }
    
}
