package jkeeler.entity;

public class UserAccount {

    int userId = 0;
    String username = "";
    String password = "";
    boolean superUser = false;

    UserAccount(){
        super();
    }
    UserAccount(username, password){
        this.username =username;
        this.password = password;
    }
    public int getUserId(){
        return this.userId;
    }
    public setUserId(int userId){

        this.userId =userId;
    }
    public String getUsername(){
        return this.username;
    }
    public setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return this.password;
    }
    public setPassword(String password){
        this.password = password;
    }
    public boolean isSuperUser(){
        return this.isSuperUser;
    }
    public setSuperUser(boolean superUser){
        this.superUser = superUser;
    }

}
