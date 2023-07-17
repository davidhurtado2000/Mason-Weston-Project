package entities;

public class UserAccount extends Person{
    private String username, password;

    public UserAccount(String username, String password, String name, String lastname, String city, String state, String country) {
        super(name, lastname, city, state, country);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  
    
   
}
