package jkeeler.entity;

import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@Table(name = "UserAccount")
public class UserAccount {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId = 0;
    @Column(name = "Username")
    private String username = "";
    @Column(name = "Password")
    private String password = "";
    @Column(name = "SuperUser")
    private boolean superUser = false;

    public UserAccount(){
        super();
    }
    public UserAccount(String username, String password){
        this.username = username;
        this.password = password;
    }
    public UserAccount(String username, String password, boolean SuperUser){
        this.username = username;
        this.password = password;
        this.superUser = SuperUser;
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
