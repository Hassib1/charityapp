package ma.emsi.donation.repository;

import ma.emsi.donation.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DonationRepository extends JpaRepository<Donation,Long> {
}
