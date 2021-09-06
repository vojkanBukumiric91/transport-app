package transportapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "truck")
public class Truck {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name = "capacity", nullable = false)
    private String capacity;
	
	public Truck() {
		super();
	}

	public Truck(Long id, String capacity) {
		super();
		this.id = id;
		this.capacity = capacity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Truck [id=" + id + ", capacity=" + capacity + "]";
	}
	
}
