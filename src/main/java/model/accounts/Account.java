package model.accounts;

public class Account {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;
    
    /**
     * Constructs Account object with the provided information.
     * 
     * @param firstName the first name of the account holder.
     * @param lastName the last name of the account holder.
     * @param userName the unique username associated with the account.
     *                 the key of the hash map.
     * @param password the password for the account.
     * @param email the email of the account holder.
     * @param phoneNumber the phone number of the account holder.
     */
    public Account(String firstName, String lastName, String userName, String password, String email, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Returns the First name of the user.
     * 
     * This method uses the built-in accessor method of Java.
     * It returns the firstName variable value of the String.
     * 
     * @return the First name of the user.
     */
    public String getFirstName(){
        return firstName;
    }
     
    /**
     * Sets the First name of the user.
     * 
     * This method uses the built-in mutator method of Java.
     * It sets the value of firstName variable.
     * 
     * @param firstName The new First name to be set for the person.
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    /**
     * Returns the Last name of the user.
     * 
     * This method uses the built-in accessor method of Java.
     * It returns the lastName variable value of the String.
     * 
     * @return the Last name of the user.
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Sets the Last name of the user.
     * 
     * This method uses the built-in mutator method of Java.
     * It sets the value of lastName variable.
     * 
     * @param lastName The new Last name to be set for the person.
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    /**
     * Returns the Username in lowercase format.
     * 
     * This method uses the built-in accessor and toLowerCase methods of Java.
     * It returns the userName variable value of the String.
     * 
     * @return the Username in lowercase.
     */
    public String getUserName(){
        return userName.toLowerCase();
    }
    
    /**
     * Sets the Username of the user.
     * 
     * This method uses the built-in mutator method of Java.
     * It sets the value of userName variable.
     * 
     * @param userName The new Username to be set for the person.
     */
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    /**
     * Returns the Password of the user.
     * 
     * This method uses the built-in accessor method of Java.
     * It returns the password variable value of the String.
     * 
     * @return the Password of the user.
     */
    public String getPassword(){
        return password;
    }
    
    /**
     * Sets the Password of the user.
     * 
     * This method uses the built-in mutator method of Java.
     * It sets the value of password variable.
     * 
     * @param password The new Password to be set for the person.
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * Returns the Email of the user.
     * 
     * This method uses the built-in accessor method of Java.
     * It returns the email variable value of the String.
     *  
     * @return the Email of the user.
     */
    public String getEmail(){
        return email;
    }
    
    /**
     * Sets the Email of the user.
     * 
     * This method uses the built-in mutator method of Java.
     * It sets the value of email variable.
     * 
     * @param email The new Email to be set for the person.
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * Returns the Phone number of the user.
     * 
     * This method uses the built-in accessor method of Java.
     * It returns the phoneNumber variable value of the String.
     * 
     * @return the Phone number of the user.
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    /**
     * Sets the Phone number of the user.
     * 
     * This method uses the built-in mutator method of Java.
     * It sets the value of phoneNumber variable. 
     *
     * @param phoneNumber The new Phone number to be set for the person.
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Checks if login credential inputs are equal to the stored username and password from an object.
     * 
     * This method performs a case-insensitive comparison of the provided username with the
     * stored username and checks if the provided password matches the stored password.
     * 
     * @param userName the username to be checked.
     * @param password the password to be checked.  
     * @return true if the arguments are equal to the stored credentials, or false otherwise.
     */
    public boolean checkCredentials(String userName, String password){
        return this.userName.equalsIgnoreCase(userName) && this.password.equals(password);
    }
    
}