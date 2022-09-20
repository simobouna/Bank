package miage.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class compte {

    @Id
    private String IBAN;
    private String type;
    private float interet;
    private String frais;

    public compte(){

    }
    public compte(String IBAN, String type, Float interet, String frais) {
        this.IBAN = IBAN;
        this.type = type;
        this.interet = interet;
        this.frais = frais;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getInteret() {
        return interet;
    }

    public void setInteret(float interet) {
        this.interet = interet;
    }

    public String getFrais() {
        return frais;
    }

    public void setFrais(String frais) {
        this.frais = frais;
    }
}
