package miage.bank.controller;

import java.util.List;
import java.util.Optional;
import miage.bank.model.transaction;
import miage.bank.service.transactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class transactionController {
    @Autowired
    private transactionService transactionService;

    @RequestMapping("/transaction/id/{id}")
    public Optional<transaction> getTransactionById(@PathVariable Long id) {
        return transactionService.getTransactionById(id);
    }

    @RequestMapping("/transaction/all")
    public List<transaction> getAllTransaction() {
        return transactionService.getAllTransaction();
    }

    @RequestMapping("/transaction/type/{type}")
    public List<transaction> getTransactionByType(@PathVariable String type) {
        return transactionService.getTransactionByType(type);
    }

    @RequestMapping("/transaction/source/{source}")
    public List <transaction> getTransactionBySource(@PathVariable String source) {
        return transactionService.getTransactionBySource(source);

    }

    @RequestMapping("/transaction/destination/{destination}")
    public List <transaction> getTransactionByDestination(@PathVariable String destination) {
        return transactionService.getTransactionByDestination(destination);
    }

    @RequestMapping("/transaction/devise/{devise}")
    public List<transaction> getTransactionByDevise(@PathVariable String devise) {
        return transactionService.getTransactionByDevise(devise);
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
