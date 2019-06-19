/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 
 */
public class Show {
    static Scanner scan = new Scanner( System.in);
    static Account admin1 = new Account("admin","admin");
    static Admin admin = new Admin(admin1);

    static Account account1 = new Account("trungnguyen","trung123",100000000,1,"ABC");
    static Account account2 = new Account("thaotran","thao123",1000000,1,"Vietcombank");

    static Loyalty_User user = new Loyalty_User("Nguyen Tan Trung",account1);
    static Common_User user1 = new Loyalty_User("Tran Thi Thao",account2);
    static User login = null;
        
    static ArrayList<User> listUser = new ArrayList<User>();
    public static void showMenu(User a) {
        login = a;
        if(a.getAcount().getType() == 1){
            System.out.println("************************************************");
            System.out.println("*         Emulator ATM application             *");
            System.out.println("************************************************");
            System.out.println("=======================MENU=====================");
            System.out.println("Choose, please!: ");
            System.out.println("1.Withdraw Cash");
            System.out.println("2.Transfer Funds");
            System.out.println("3.Check Balance");
            System.out.println("4.Log Out"); 
            System.out.println("Choose: "); 
            user();
        }
        else if(a.getAcount().getType() == 0){
            System.out.println("************************************************");
            System.out.println("*         Emulator ATM application             *");
            System.out.println("************************************************");
            System.out.println("=======================MENU=====================");
            System.out.println("Choose, please: ");
            System.out.println("1.Add balance for ATM");
            System.out.println("2.Add balance for USER");
            System.out.println("3.Create user account"); 
            System.out.println("4.Reset user password"); 
            System.out.println("Choose: "); 
        }
    }
    public static void user() {
    Scanner nhap = new Scanner( System.in);   
    
    int a;
        a=nhap.nextInt();
	switch(a){
	case 1:
	withdraw();
        break;
            
	case 2:
  	System.out.println("___________________TRANSFER FUNDS___________________");
	break;
            
	case 3:
	checkBalance();
	break;
            
	case 4:
	System.out.println("Do you want to log out?");
        System.out.println("1.Yes       2.No");
        int n = scan.nextInt();
        if(n == 1)
            back();
        if(n == 2)
            login.logout(login);
        break;
            
}
}    
    public void main1() {
    Scanner nhap = new Scanner( System.in);   
    
    int a;
        a=nhap.nextInt();
	switch(a){
        case 1:
	System.out.println("________________ADD BALANCE FOR ATM________________");
        break;
            
	case 2:
	System.out.println("________________ADD BALANCE FOR USER_______________");
        break;
            
        case 3:
	System.out.println("________________CREATE USER ACCOUNT________________");
        break;
            
        case 4:
	System.out.println("________________RESET USER PASSWORD________________");
        break;
            
        case 5:
	System.out.println("THANK YOU FOR SERVICE USING");
        break;
        }
    }
    public static void showLogin() {
    System.out.println("************************************************");
    System.out.println("*         Emulator ATM application             *");
    System.out.println("************************************************");
    System.out.println("===============WELCOME YOU TO ATM================");
    System.out.println("Please login to continue: ");
    System.out.println("1.LOGIN ");
    System.out.println("2.CANCLE ");
    
       
    int a;
    String account;
    String password;
    a=scan.nextInt();
    scan.nextLine();
    switch(a){
	case 1:
	System.out.println("___________________LOG IN___________________");
	System.out.println("Account: ");
        account = scan.nextLine();
        System.out.println("Password: ");
        password = scan.nextLine();
        User.login(account, password, listUser);
        break;
        
        case 2:
	System.out.println("THANK YOU FOR USING SERVICE");
        break;
        }
    }
    
    public static void withdraw(){
        int money = 0;
        System.out.println("___________________WITHDRAW CASH___________________");
        System.out.println("How many money: ");
        money = scan.nextInt();
        System.out.println("You have just withdrawed "+money+" VND\nThank you for using our service ♥");       
        login.withdrawCash(money);      
    }
    
    public static void checkBalance(){
        System.out.println("___________________CHECK BALANCE___________________");
        System.out.println("Mr/ Ms. "+login.getName());
        System.out.println("Bank: "+login.getAcount().getBank());
        System.out.println("Balance: "+login.getAcount().getBalance());
        printBill();
    }
    
    public static void printBill(){
        int t = 0;
        int m = 0;
        System.out.println("\nDo you want to printf Bill");
        System.out.println("1.Yes       2.No");
        t = scan.nextInt();
        if(t == 1){
            System.out.println("Take your card then take the bill");
            login.logout(login);
        }else if(t == 2){           
            System.out.println("Do you want to use other function?");
            System.out.println("1.Yes       2.No");
            
            m = scan.nextInt();
            if(m == 1)
                back();
            if(m == 2)
            login.logout(login);
        }
            
    }
    
    public static void back(){
        showMenu(login);
    }
 
    public static void main(String[] args) {
    listUser.add(admin);
    listUser.add(user1);
    listUser.add(user);
    Show.showLogin();
    
}
}
