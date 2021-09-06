package transportapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import transportapp.model.Truck;
import transportapp.service.TruckService;

@RestController
@RequestMapping("/trucks")
public class TruckController {

	@Autowired
	private TruckService truckService;

	@PostMapping
	public void saveTruck(@RequestBody Truck truck) {
		truckService.save(truck);
	}

	@GetMapping
	public List<Truck> findAllTrucks() {
		return truckService.findAll();
	}

	@GetMapping("{id}")
	public Optional<Truck> getTruckById(@PathVariable Long id) {
		return truckService.findById(id);
	}

	@DeleteMapping("{id}")
	public void deleteTruck(@PathVariable Long id) {
		truckService.deleteById(id);
	}

}
