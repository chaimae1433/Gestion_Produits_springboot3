package ma.chaimae.produits.repos;

import java.util.List;

import ma.chaimae.produits.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "api")
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
	List<Produit> findByNomProduit(String nom);
	List<Produit> findByNomProduitContains(String nom);
	
	/*@Query("select p from Produit p where p.nomProduit like %?1 and p.prixProduit > ?2")
	List<Produit> findByNomPrix (String nom, Double prix);*/
	
	@Query("select p from Produit p where p.nomProduit like %:nom and p.prixProduit > :prix")
	List<Produit> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);

	

	
	List<Produit> findByOrderByNomProduitAsc();
	
	@Query("select p from Produit p order by p.nomProduit ASC, p.prixProduit DESC")
	List<Produit> trierProduitsNomsPrix ();

}
