package pe.edu.upn.hrsN00062649.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.hrsN00062649.model.entity.Locations;
import pe.edu.upn.hrsN00062649.model.repository.LocationsRepository;
import pe.edu.upn.hrsN00062649.service.LocationsService;

@Service
public class LocationsServiceImpl implements LocationsService {

	@Autowired
	private LocationsRepository locationsRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Locations> findAll() throws Exception {
		return locationsRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Locations> findById(Integer id) throws Exception {
		return locationsRepository.findById(id);
	}

	@Transactional
	@Override
	public Locations save(Locations entity) throws Exception {
		return locationsRepository.save(entity);
	}

	@Transactional
	@Override
	public Locations update(Locations entity) throws Exception {
		return locationsRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		locationsRepository.deleteById(id);
		
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		locationsRepository.deleteAll();
		
	}

}
