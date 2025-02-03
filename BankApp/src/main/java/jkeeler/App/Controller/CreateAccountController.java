package jkeeler.App.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.Model;

import jkeeler.App.Entity.*;
import jkeeler.App.Service.*;


@Controller
@SessionAttributes("loginInfo")
public class CreateAccountController {
    @Autowired
    private UserAccountServiceImpl userAccountServiceImpl;
    @Autowired
    private BankAccountServiceImpl bankAccountServiceImpl;
    @Autowired
    private TransactionServiceImpl transactionServiceImpl;

    @GetMapping("/createAccount")
    public String createAccount(Model model) {
        return "createAccount";
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

    @PostMapping("/createUserWithData")
    public String createUserWithData(@RequestParam("username") String username,
                             @RequestParam("password") String password,
                             @RequestParam("email") String email,
                             Model model) {

        UserAccount user = userAccountServiceImpl.createAccount(username,password,email, false);
        BankAccount bankAccount = bankAccountServiceImpl.createAccount(user);
                // Create a new transaction and add it to the list
        Random random = new Random();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Define the range for random dates
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 12, 31);
        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = endDate.toEpochDay();
        LocalDate currentDate = startDate; // Initialize the current date

        for (int i = 0; i < 30; i++) {
            Transaction trans = new Transaction();
            trans.setAmount(random.nextDouble() * 1000); // Random amount between 0 and 1000
            bankAccount.setBalance(bankAccount.getBalance() + trans.getAmount() );
            trans.setBankId(bankAccount.getBankAccountId());

            // Increment the date randomly
            int daysToAdd = random.nextInt(10) + 1; // Increment by a random value between 1 and 10 days
            currentDate = currentDate.plusDays(daysToAdd);
            trans.setDate(currentDate.format(formatter)); // Format the date
            
            transactionServiceImpl.addTransaction(trans);
        }
        return "home";
    }
}
