package ma.emsi.user.repository;

import ma.emsi.user.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<Utilisateur,Long> {
}
