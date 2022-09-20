package miage.bank.service;

import java.util.Optional;
import miage.bank.model.compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class compteService {
    @Autowired
    private miage.bank.repository.compteRepository compteRepository;

    public Optional<compte> getCompte(String IBAN){
        return compteRepository.findById(IBAN);
    }

    public void createCompte(compte compte){
        compteRepository.save(compte);
    }

    public void updateCompte(String iban, compte compte){
        compte.setIBAN(iban);
        compteRepository.save(compte);
    }

    public void deleteCompte(String iban){
        compteRepository.deleteById(iban);
    }
}
