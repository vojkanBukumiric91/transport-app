package transportapp.service;

import java.util.List;
import java.util.Optional;

import transportapp.model.Truck;

public interface TruckService {
	
	public void save (Truck truck);
	public List<Truck>findAll();
	public Optional<Truck> findById(Long id);
	public void deleteById(Long id);

}
