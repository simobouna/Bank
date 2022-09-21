package miage.bank.controller;

import java.util.Optional;
import miage.bank.model.compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class compteController {

    @Autowired
    private miage.bank.service.compteService compteService;

    @RequestMapping("/compte/{IBAN}")
    public Optional<compte> getCompte(@PathVariable String IBAN) {
        return compteService.getCompte(IBAN);
    }

    @RequestMapping(method= RequestMethod.POST, value="/compte")
    public void createCompte(@RequestBody compte compte){
        compteService.createCompte(compte);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/compte/{IBAN}")
    public void updateCompte(@PathVariable String IBAN, @RequestBody compte compte){
        compteService.updateCompte(IBAN,compte);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/compte/{IBAN}")
    public void deleteCompte(@PathVariable String IBAN){
        compteService.deleteCompte(IBAN);
    }
}
