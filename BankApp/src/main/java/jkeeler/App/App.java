package jkeeler.App;
import java.util.Scanner;

import jkeeler.Service.*;

//import ch.qos.logback.core.joran.sanity.Pair;
import jkeeler.entity.BankAccount;
import jkeeler.entity.UserAccount;
public class App {
    private UserAccount loggedInUser = null;
    private UserAccountServiceImpl UserService = new UserAccountServiceImpl();
    public static void main(String[] args) {
        App app = new App();
        app.Run();
    }
    public void Run() {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("L Logging in \t");
        System.out.print("C Creating an Account \t\n");
        switch(scanner.nextLine())
        {
            case "L":
                this.loggedInUser = logginPage();
                if(this.loggedInUser != null){
                    System.out.println(loggedInUser.getUsername());
                }
                break;
            case "C":
                this.loggedInUser = CreateAccountPage();
                if(this.loggedInUser != null)
                {
                    System.out.println(loggedInUser.getUsername());
                }else{
                    System.out.print(this.loggedInUser);
                }
                break;  
            default:
            System.out.print("Unkown Command");
                break;

        }
        
    }

    public UserAccount logginPage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("UserName:");
        String Username = scanner.nextLine();
        System.out.println("Password:");
        String Password = scanner.nextLine(); 
        return UserService.logIn(Username,Password );
        
        
    }

    public UserAccount CreateAccountPage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("UserName:");
        String Username = scanner.nextLine();
        System.out.println("Password:");
        String Password = scanner.nextLine(); 
        return UserService.createAccount(Username,Password);
    }
}
