package pe.edu.upn.hrsN00062649.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.hrsN00062649.model.entity.Countries;
import pe.edu.upn.hrsN00062649.model.repository.CountriesRepository;
import pe.edu.upn.hrsN00062649.service.CountriesService;

@Service
public class CountriesServiceImpl implements CountriesService{

	@Autowired
	private CountriesRepository countriesRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Countries> findAll() throws Exception {
		return countriesRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<Countries> findById(String id) throws Exception {
		return countriesRepository.findById(id);
	}

	@Transactional
	@Override
	public Countries save(Countries entity) throws Exception {
		return countriesRepository.save(entity);
	}

	@Transactional
	@Override
	public Countries update(Countries entity) throws Exception {
		return countriesRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		countriesRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		countriesRepository.deleteAll();
		
	}

}
