package transportapp.service.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import transportapp.model.Truck;
import transportapp.repository.TruckRepository;

@SpringBootTest
public class TruckServiceImplTest {

	@InjectMocks
	TruckServiceImpl truckServiceImpl;

	@Mock
	TruckRepository truckRepository;

	@Test
	public void saveStudent() {
		Truck truck = new Truck(1L, "500t");
		when(truckRepository.save(truck)).thenReturn(truck);
		assertNotNull(truck);

	}

	@Test
	public void findAllTest() {

		List<Truck> trucks = new ArrayList<>();
		trucks.add(new Truck(1L, "500t"));
		trucks.add(new Truck(2L, "1000t"));
		trucks.add(new Truck(3L, "2000t"));

		Mockito.when(truckRepository.findAll()).thenReturn(trucks);

		assertFalse(trucks.isEmpty());

	}

	@Test
	public void deleteByIdTest() {
		Truck truck = new Truck();
		truck.setId(1L);
		truck.setCapacity("4000t");
		truckRepository.deleteById(1L);
		verify(truckRepository, times(1)).deleteById(1L);

	}
	
	@Test
	public void findByIdTest() {
		Truck truck = new Truck();
		truck.setId(1L);
		truck.setCapacity("4000t");
		Mockito.when(truckRepository.findById(1L)).thenReturn(Optional.of(truck));
		
	}

}
