package ma.emsi.paiement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication

@EntityScan(basePackages = {"ma.emsi.paiement.model", "ma.emsi.donation.model","ma.emsi.organisation.model","ma.emsi.user.model"})
public class PaiementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaiementApplication.class, args);
	}

}
