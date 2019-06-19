/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import java.io.*; 
import java.util.*; 
import java.util.ArrayList;

/**
 *
 * @author trung.nguyen
 */
public class main {
    
   
    
    public static void main(String[] args) {
        Account admin1 = new Account("admin","admin");
        Admin admin = new Admin(admin1);

        Account account1 = new Account("trungnguyen","trung123",100000000,1,"ABC");
        Account account2 = new Account("thaotran","thao123",1000000,2,"Vietcombank");

        Loyalty_User user = new Loyalty_User("Nguyen Tan Trung",account1);
        Common_User user1 = new Loyalty_User("Tran Thi Thao",account2);
        
        ArrayList<Account> listAccount = new ArrayList<Account>();
        listAccount.add(admin1);
        listAccount.add(account1);
        listAccount.add(account2);
        
        
        System.out.println(listAccount.get(2).getBalance());
    }

            
}
