package model;

import java.util.HashMap;
import java.util.Map;

public class Accounts {
   private Map<String, Account> accountMap;  
   
   public Accounts(){
       this.accountMap = new HashMap<>(); 
   }
   
   public void addAccount(String firstName, String lastName, String userName, String password, String email, String phoneNumber){ //stores all the account objects
       String lowerCaseUserName = userName.toLowerCase();
       Account newAccount = new Account(firstName, lastName, lowerCaseUserName, password, email, phoneNumber);
       
       accountMap.put(lowerCaseUserName, newAccount);
   }
   
   public Account getAccountByUserName(String userName){ //used to retrieve an Account object - username
       return accountMap.get(userName);
   }
   
   public boolean logIn(String userName, String password){ //login method - checks if the credentials are true, method found in Account class
       Account account = accountMap.get(userName);
       return account != null && account.checkCredentials(userName, password);
   }
}
