package miage.bank.repository;

import miage.bank.model.transaction;
import org.springframework.data.repository.CrudRepository;

public interface transactionRepository extends CrudRepository<transaction, Long> {
}
