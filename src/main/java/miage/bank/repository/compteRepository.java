package miage.bank.repository;

import miage.bank.model.compte;
import org.springframework.data.repository.CrudRepository;

public interface compteRepository extends CrudRepository<compte, String> {
}
