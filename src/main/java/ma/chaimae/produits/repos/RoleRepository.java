package ma.chaimae.produits.repos;

import ma.chaimae.produits.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(String role);
	
}
