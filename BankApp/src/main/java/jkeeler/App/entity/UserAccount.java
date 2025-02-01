package jkeeler.App.Entity;

import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "UserAccount")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId = 0L;
    @Column(name = "Username")
    private String username = "";
    @Column(name = "Password")
    private String password = "";
    @Column(name = "Email")
    private String email = "";
    @Column(name = "SuperUser")
    private boolean superUser = false;

    public UserAccount(){
        super();
    }
    public UserAccount(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public UserAccount(String username, String password,String email, boolean superUser){
        this.username = username;
        this.password = password;
        this.email = email;
        this.superUser = superUser;
    }
    public Long getUserId(){
        return this.userId;
    }
    public void setUserId(Long userId){

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
