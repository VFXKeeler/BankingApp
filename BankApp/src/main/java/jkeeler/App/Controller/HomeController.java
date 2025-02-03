package jkeeler.App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.Model;

import jkeeler.App.Entity.UserAccount;
import jkeeler.App.Service.BankAccountServiceImpl;
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

        return "home";
    }
    

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {
                            
        UserAccount user = userAccountServiceImpl.findByUsername(username);
        boolean isValidUser =  user !=null;
        boolean isNotEmpty = username.length() >1 && password.length()>1;

        if (isValidUser) {
            LoginInfo loginInfo = new LoginInfo(username, user.getEmail(), password);
            model.addAttribute("loginInfo", loginInfo);
            return "redirect:/account";
        } else if(isNotEmpty)  {
            model.addAttribute("error", "Invalid credentials");
            return "home";
        }else{
            return "home";
        }
    }

}
