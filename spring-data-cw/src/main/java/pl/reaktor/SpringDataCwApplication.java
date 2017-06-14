package pl.reaktor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.reaktor.model.Car;
import pl.reaktor.repository.CarRepository;

@SpringBootApplication
public class SpringDataCwApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataCwApplication.class, args);
        
        //utworzenie nowej tabeli SQL
        List<Car> cars = new ArrayList<>();
        
        cars.add(new Car("A4", "Audi", 49000.0));
        cars.add(new Car("Auris", "Toyota", 35000.0));
        cars.add(new Car("Insignia", "Opel", 29500.0));
         
        CarRepository carRepo = ctx.getBean(CarRepository.class);
        cars.forEach(carRepo::save); //zapisujemy samochody
         
        Car firstCar = carRepo.findOne(1L); //pobieramy pierwszy
        carRepo.delete(firstCar); //usuwamy go
         
        //pobieramy i wyświetlamy pozostałe
        carRepo.findAll().forEach(System.out::println);
        carRepo.count();

        ctx.close();
	}
}
