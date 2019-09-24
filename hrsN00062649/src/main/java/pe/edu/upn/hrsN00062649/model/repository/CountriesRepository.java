package pe.edu.upn.hrsN00062649.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.hrsN00062649.model.entity.Countries;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, String> {

}
