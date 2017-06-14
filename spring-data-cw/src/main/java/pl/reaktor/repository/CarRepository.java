package pl.reaktor.repository;

import org.springframework.data.repository.CrudRepository; 
import org.springframework.stereotype.Repository; 
import pl.reaktor.model.Car; 
  
@Repository 
public interface CarRepository extends CrudRepository<Car, Long> { 
}
