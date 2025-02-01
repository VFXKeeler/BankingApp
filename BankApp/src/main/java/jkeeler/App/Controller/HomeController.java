package jkeeler.App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.Model;

import jkeeler.App.Entity.UserAccount;
import jkeeler.App.Service.BankAccountServiceImpl;
import jkeeler.App.Service.UserAccountService;
import jkeeler.App.Service.UserAccountServiceImpl;

@Controller
@SessionAttributes("loginInfo")
public class HomeController {
    @Autowired
    private UserAccountServiceImpl userAccountServiceImpl;
    @Autowired
    private BankAccountServiceImpl bankAccountServiceImpl;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to the Home Page");
        return "home";
    }
    

    @PostMapping("/account")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {
                            

        boolean isValidUser = userAccountServiceImpl.findByUsername(username) !=null;
        boolean isNotEmpty = username.length() >1 && password.length()>1;

        if (isValidUser) {
            LoginInfo loginInfo = new LoginInfo(username, password);
            model.addAttribute("loginInfo", loginInfo);
            return "redirect:/account";
        } else if(isNotEmpty)  {
            model.addAttribute("error", "Invalid credentials");
            return "home";
        }else{
            return "home";
        }
    }

    @PostMapping("/createUser")
    public String createUser(@RequestParam("username") String username,
                             @RequestParam("password") String password,
                             @RequestParam("email") String email,
                             Model model) {

        UserAccount user = userAccountServiceImpl.createAccount(username,password,email, false);
        bankAccountServiceImpl.createAccount(user);
        return "home";
    }
}
