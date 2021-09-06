package transportapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import transportapp.model.Truck;
import transportapp.repository.TruckRepository;
import transportapp.service.TruckService;

@Service
public class TruckServiceImpl implements TruckService {

	@Autowired
	TruckRepository truckRepository;

	@Override
	public void save(Truck truck) {
		truckRepository.save(truck);

	}

	@Override
	public List<Truck> findAll() {
		List<Truck> trucks = truckRepository.findAll();
		return trucks;
	}

	@Override
	public Optional<Truck> findById(Long id) {

		return truckRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {

		truckRepository.deleteById(id);

	}

}
