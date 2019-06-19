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
public class ATM {
    private double balance;
    public String bank;
    public Integer idATM;

    ATM(){
        
    }
    ATM(double balance, String bank, Integer idATM) {
        this.balance = balance;
        this.bank = bank;
        this.idATM = idATM;
    }
    
    public String sendRequest(){
        return null;
        
    }
    public Double getBalance(){
        return null;    
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String getBank(){
        return null;
    }
    public Integer getID(){
        return null;
    }
}
