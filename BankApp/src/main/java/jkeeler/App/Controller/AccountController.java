package jkeeler.App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import jkeeler.App.Entity.Transaction;
import jkeeler.App.Entity.UserAccount;
import jkeeler.App.Entity.BankAccount;


import jkeeler.App.Service.TransactionServiceImpl;
import jkeeler.App.Service.UserAccountService;
import jkeeler.App.Service.BankAccountService;

import java.util.List;

@Controller
@SessionAttributes("loginInfo")
public class AccountController {

    @Autowired
    private UserAccountService userAccountService;
    
    @Autowired
    private TransactionServiceImpl transactionService;

    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping("/account")
    public String account(@ModelAttribute("loginInfo") LoginInfo loginInfo,Model model) {
        
        String username = loginInfo.getUsername(); 
        // Fetch user details and transactions
        UserAccount userAccount = userAccountService.findByUsername(username);
        
        BankAccount bankAccount = bankAccountService.findByUserId(userAccount.getUserId());
        

        List<Transaction> transactions = transactionService.findByBankId(bankAccount.getBankAccountId());
        // Add details to the model
        model.addAttribute("userAccount", userAccount);
        model.addAttribute("transactions", transactions);
        model.addAttribute("bankAccount", bankAccount);

        return "account";
    }
}

