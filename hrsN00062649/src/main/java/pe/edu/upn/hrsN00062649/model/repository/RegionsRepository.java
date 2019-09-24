package pe.edu.upn.hrsN00062649.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.hrsN00062649.model.entity.Regions;

@Repository
public interface RegionsRepository extends JpaRepository<Regions, Integer>{

}
