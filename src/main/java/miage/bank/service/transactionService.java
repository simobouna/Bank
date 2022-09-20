package miage.bank.service;

import miage.bank.model.transaction;
import miage.bank.repository.transactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class transactionService {
    @Autowired
    private transactionRepository mytransactionRepository;

    public Optional<transaction> getTransaction(Long id){
        return mytransactionRepository.findById(id);
    }

    public void createTransaction(transaction transaction){
        mytransactionRepository.save(transaction);
    }

    public void updateTransaction(Long id, transaction transaction){
        transaction.setId(id);
        mytransactionRepository.save(transaction);
    }

    public void deleteTransaction(Long id){
        mytransactionRepository.deleteById(id);
    }
    
}
