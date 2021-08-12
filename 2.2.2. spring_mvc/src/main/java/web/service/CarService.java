package web.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarService {
    private List<Car> cars = new ArrayList<>();
    public CarService() {
        cars.add(new Car("BMW", 342, "M5"));
        cars.add(new Car("Kia", 645, "RIO"));
        cars.add(new Car("Audi", 859, "Q8"));
        cars.add(new Car("Porsche", 12, "Panamera"));
        cars.add(new Car("Mercedes", 987, "GLS"));
    }
    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCars(@RequestParam(value = "count", required = false) Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
