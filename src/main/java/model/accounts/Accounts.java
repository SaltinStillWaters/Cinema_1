package model.accounts;

import java.util.HashMap;
import java.util.Map;

public class Accounts 
{
   private Map<String, Account> accountMap;  
   private static Accounts instance;
   
   public Accounts()
   {
       this.accountMap = new HashMap<>(); 
   }
   
   public static Accounts getInstance()
   {
       if (instance == null)
       {
           instance = new Accounts();
       }
       
       return instance;
   }
   
   public void addAccount(Account account)  //stores all the account objects
   { 
       accountMap.put(account.getUserName(), account);
   }
   
   public Account getAccountByUserName(String userName) //used to retrieve an Account object - username
   { 
       return accountMap.get(userName);
   }
   
   public boolean logIn(String userName, String password)   //login method - checks if the credentials are true, method found in Account class
   { 
       Account account = accountMap.get(userName);
       return account != null && account.checkCredentials(userName, password);
   }
}
