package jkeeler.App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jkeeler.App.Entity.Transaction;
import jkeeler.App.Entity.UserAccount;
import jkeeler.App.Entity.BankAccount;

import jkeeler.App.Service.TransactionService;
import jkeeler.App.Service.UserAccountService;
import jkeeler.App.Service.BankAccountService;


import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private UserAccountService userAccountService;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping("/account")
    public String account(Model model) {
        // Assuming a logged-in user with a hardcoded username for simplicity
        String username = "hardcoded_username"; // Replace this with actual user identification logic
        int bankId = 0; // Replace this with actual user identification logic
        int userId = 0; // Replace this with actual user identification logic
        // Fetch user details and transactions
        UserAccount userAccount = userAccountService.findByUsername(username);
        List<Transaction> transactions = transactionService.findByBankId(bankId);
        BankAccount bankAccount = bankAccountService.findByUserId(userId);
        // Add details to the model
        model.addAttribute("userAccount", userAccount);
        model.addAttribute("transactions", transactions);
        model.addAttribute("bankAccount", bankAccount);

        return "account";
    }
}
