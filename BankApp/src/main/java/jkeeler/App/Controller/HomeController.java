package jkeeler.App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import jkeeler.App.Entity.UserAccount;
import jkeeler.App.Service.UserAccountService;
import jkeeler.App.Service.UserAccountServiceImpl;

@Controller
public class HomeController {
    @Autowired
    private UserAccountServiceImpl userAccountServiceImpl;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to the Home Page");
        return "home";
    }
    

    @PostMapping("/account")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {
                            
        // Replace this with your actual login logic
        boolean isValidUser = "user".equals(username) && "pass".equals(password);
        isValidUser = true;

        if (isValidUser) {
            model.addAttribute("username", username);
            model.addAttribute("message", "Login successful!");
            return "account";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "home";
        }
    }

    @PostMapping("/createUser")
    public String createUser(@RequestParam("username") String username,
                             @RequestParam("password") String password,
                             Model model) {

        userAccountServiceImpl.createAccount(username,password, false);
        return "home";
    }
}
