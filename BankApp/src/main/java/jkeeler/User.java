package jkeeler;

import jakarta.persistence.*;



@Entity
@Table(name = "UserAccount")
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String password;
    @Column(name = "SuperUser")
    private boolean superUser = false;

    public User(){
        super();
    }
    public User(String un, String pw, boolean su){
        
        this.username = un;
        this.password = pw;
        this.setSuperUser(su);
    }

    public User(int id, String un, String pw, boolean su){
        
        this.userID = id;
        this.username = un;
        this.password = pw;
        this.setSuperUser(su);
    }
     // Constructors, Getters, and Setters
    public int getId() {
        return userID;
    }

    public void setId(int id) {
        this.userID = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSuperUser() {
        return superUser;
    }

    public void setSuperUser(boolean superUser) {
        this.superUser = superUser;
    }
    
}