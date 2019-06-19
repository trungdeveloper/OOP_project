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
public class Account {
    public String accountName;
    private String password;
    private int balance;
    private int type;
    public String bank;

    public Account(String accountName, String password, int balance, int type, String bank) {
        this.accountName = accountName;
        this.password = password;
        this.balance = balance;
        this.type = type;
        this.bank = bank;
    }
    
    public Account(String accountName,String password){
        this.accountName = accountName;
        this.password = password;
        this.type = 0;
        this.bank = "ABC";
    }
    
    public Account(String accountName,String password,int balance){
        this.accountName = accountName;
        this.password = password;
        this.balance = balance;
        this.type = 1;
        this.bank = "ABC";
    }

    public String getAccountName() {
        return accountName;
    }

    public int getType() {
        return type;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }

    public String getBank() {
        return bank;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}
