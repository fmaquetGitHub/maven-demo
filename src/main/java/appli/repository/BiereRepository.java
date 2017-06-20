package appli.repository;

import org.springframework.data.repository.CrudRepository;

import appli.domain.Biere;

public interface BiereRepository extends CrudRepository<Biere, Long> {

    Biere findByNom(String nom);

}
