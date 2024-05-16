package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getAllCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car( "Audi", "A6", 2020));
        cars.add(new Car( "BMW", "5 Series", 2021));
        cars.add(new Car( "Mercedes-Benz", "E-Class", 2022));
        cars.add(new Car( "Toyota", "Camry", 2023 ));
        cars.add(new Car( "Honda", "Accord", 2024));

        if (count <= 0) {
            return cars;
        }
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

}
