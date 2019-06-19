/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author thao.tran
 */
public class Common_User extends User{
    protected String name;

    public Common_User(String name, Account account){
        this.name=name;
        this.account=account;
}

    @Override
    public Account getAcount() {
        return account;
    }

    @Override
    public void setAcount(Account acount) {
        this.account = acount;
    }
    @Override
    public void checkbalance(){
    
    } 
    @Override
    public void withdrawCash(int money){
        account.setBalance(account.getBalance() - money - 3000);
        System.out.println(account.getBalance());
    }
    @Override
    public void transferFunds(double money, double reAccountname){
    
    }
    @Override
    public String printBill(){
        return null;    
    }
    @Override
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

}