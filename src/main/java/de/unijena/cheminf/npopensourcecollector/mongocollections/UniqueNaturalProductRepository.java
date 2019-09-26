package de.unijena.cheminf.npopensourcecollector.mongocollections;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "compound")
public interface UniqueNaturalProductRepository extends MongoRepository<UniqueNaturalProduct, String> {

    public List<UniqueNaturalProduct> findBySmiles(@Param("smiles") String smiles);

    public List<UniqueNaturalProduct> findByCleanSmiles(@Param("clean_smiles") String clean_smiles);

    public List<UniqueNaturalProduct> findByInchi(@Param("inchi") String inchi);

    public List<UniqueNaturalProduct> findByInchikey(@Param("inchikey") String inchikey);

    public List<UniqueNaturalProduct> findByMolecularFormula(@Param("molecular_formula") String molecular_formula);

    public List<UniqueNaturalProduct> findByMolecularWeight(@Param("molecular_weight") Double molecular_weight);

}
