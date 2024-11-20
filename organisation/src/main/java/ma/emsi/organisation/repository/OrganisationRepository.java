package ma.emsi.organisation.repository;

import ma.emsi.organisation.model.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrganisationRepository extends JpaRepository<Organisation,Long> {
}
