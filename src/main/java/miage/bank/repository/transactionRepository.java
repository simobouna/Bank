package miage.bank.repository;

import java.util.Date;
import java.util.List;
import miage.bank.model.transaction;
import org.springframework.data.repository.CrudRepository;

public interface transactionRepository extends CrudRepository<transaction, Long> {
    List <transaction> findByType(String type);
    List <transaction> findByDevise(String devise);
    List <transaction> findByDate(Date date);
    List <transaction> findBySource(String source);
    List <transaction> findByDestination(String destination);
}
