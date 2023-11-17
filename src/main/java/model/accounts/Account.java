package model.accounts;

public class Account {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;
    
    /**
     * Constructor method, initialize variables of an object.
     * 
     * @param firstName
     * @param lastName
     * @param userName
     * @param password
     * @param email
     * @param phoneNumber 
     */
    public Account(String firstName, String lastName, String userName, String password, String email, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getUserName(){
        return userName.toLowerCase();
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Checks if login credential inputs are equal to the stored username and 
     * password from an object.
     * 
     * @param userName
     * @param password
     * @return true if the arguments are equal to the given conditions.
     */
    public boolean checkCredentials(String userName, String password){
        return this.userName.equalsIgnoreCase(userName) && this.password.equals(password);
    }
    
}