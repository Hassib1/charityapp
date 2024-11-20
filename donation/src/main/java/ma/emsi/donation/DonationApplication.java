package ma.emsi.donation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"ma.emsi.donation.model", "ma.emsi.user.model" , "ma.emsi.organisation.model"})
public class DonationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonationApplication.class, args);
	}

}
