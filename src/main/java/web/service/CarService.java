package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> all();

    List<Car> counted(int count);
}
