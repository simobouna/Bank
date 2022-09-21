package miage.bank.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import miage.bank.model.transaction;
import miage.bank.repository.transactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class transactionService {
    @Autowired
    private transactionRepository mytransactionRepository;

    public Optional<transaction> getTransactionById(Long id){
        return mytransactionRepository.findById(id);
    }
    
    public List <transaction> getAllTransaction(){
        List <transaction> ret = new ArrayList<>();
        mytransactionRepository.findAll().forEach(ret::add);
        return ret;
    }

    public List<transaction> getTransactionByType(String type){
        List <transaction> ret = new ArrayList<>();
        mytransactionRepository.findByType(type).forEach(ret::add);
        return ret;
    }
    
    public List<transaction> getTransactionBySource(String source){
        List <transaction> ret = new ArrayList<>();
        mytransactionRepository.findBySource(source).forEach(ret::add);
        return ret;
    }
    public List<transaction> getTransactionByDestination(String destination){
        List <transaction> ret = new ArrayList<>();
        mytransactionRepository.findByDestination(destination).forEach(ret::add);
        return ret;
    }

    public List<transaction> getTransactionByDevise(String devise){
        List <transaction> ret = new ArrayList<>();
        mytransactionRepository.findByDevise(devise).forEach(ret::add);
        return ret;
    }

    public List<transaction> getTransactionByDate(Date date){
        List <transaction> ret = new ArrayList<>();
        mytransactionRepository.findByDate(date).forEach(ret::add);
        return ret;
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
