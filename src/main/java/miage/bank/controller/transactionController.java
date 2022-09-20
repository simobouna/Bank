package miage.bank.controller;

import miage.bank.model.transaction;
import miage.bank.service.transactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class transactionController {
    @Autowired
    private transactionService transactionService;

    @RequestMapping("/transaction/{id}")
    public Optional<transaction> getTransaction(@PathVariable Long id) {
        return transactionService.getTransaction(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/transaction")
    public void createTransaction(@RequestBody transaction transaction){
        transactionService.createTransaction(transaction);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/transaction/{id}")
    public void updateTransaction(@PathVariable Long id, @RequestBody transaction transaction){
        transactionService.updateTransaction(id,transaction);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/transaction/{id}")
    public void deleteTransaction(@PathVariable Long id){
        transactionService.deleteTransaction(id);
    }

}
