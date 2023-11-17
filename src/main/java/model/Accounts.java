package model;

import java.util.HashMap;
import java.util.Map;

public class Accounts {
   private Map<String, Account> accountMap;  
   
   public Accounts(){
       this.accountMap = new HashMap<>(); 
   }
   
    public void addAccount(Account account) {
        accountMap.put(account.getUserName(), account);
    }
   
   public Account getAccountByUserName(String userName){ //used to retrieve an Account object - username
       return accountMap.get(userName);
   }
   
   public boolean logIn(String userName, String password){ //login method - checks if the credentials are true, method found in Account class
       userName = userName.toLowerCase();
       Account account = accountMap.get(userName);
       return account != null && account.checkCredentials(userName, password);
   }
}
