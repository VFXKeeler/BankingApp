package jkeeler.entity;

import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
@Table(name = "UserAccount")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId = 0;
    private String username = "";
    private String password = "";
    private boolean superUser = false;

    public UserAccount(){
        super();
    }
    public UserAccount(String username, String password){
        this.username = username;
        this.password = password;
    }
    public int getUserId(){
        return this.userId;
    }
    public void setUserId(int userId){

        this.userId =userId;
    }
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public boolean isSuperUser(){
        return this.superUser;
    }
    public void setSuperUser(boolean superUser){
        this.superUser = superUser;
    }

}
