package transportapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import transportapp.model.Truck;
@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {

}
