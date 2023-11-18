package model.accounts;

import java.util.HashMap;
import java.util.Map;

public class Accounts {
   private Map<String, Account> accountMap;  
   
   /**
    * Initializes a new instance of the Accounts class with an empty account map.
    * The account map is used to store account information.
    */
   public Accounts(){
       this.accountMap = new HashMap<>(); 
   }
   
   /**
    * Adds account to the account map;
    * 
    * @param account the account to be added.
    *                the account username will be used as the key of account map.
    */
   public void addAccount(Account account) {
        accountMap.put(account.getUserName(), account);
   }
   
   /**
    * Returns an account object based from the provided username.
    * 
    * @param userName the username of the account to be retrieved.
    * @return the account associated with the provided username.
    */ 
   public Account getAccountByUserName(String userName){ 
       return accountMap.get(userName);
   }
   
   /**
    * Attempts to log in a user with the provided username and password.
    * 
    * This method performs the following steps:
    *   1. Converts the provided username to lowercase for case-insensitive comparison.
    *   2. Retrieves the user account associated with the username from the account map.
    *   3. Checks if the account exists and if the provided password matches the stored credentials.
    * 
    * @param userName the username for login attempt.
    * @param password the password for login attempt.
    * @return true if login is successful, or false otherwise.
    */
   public boolean logIn(String userName, String password){
       userName = userName.toLowerCase();
       Account account = accountMap.get(userName);
       return account != null && account.checkCredentials(userName, password);
   }
}