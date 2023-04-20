package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;


    CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(1,"UAZ",469));
        cars.add(new Car(2,"GAZ",352));
        cars.add(new Car(3,"VAZ",128));
        cars.add(new Car(4,"TOYOTA",25));
        cars.add(new Car(5,"BMW",525));
    }


    public List<Car> counted(Integer count) {
        if (count != null){
            return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }

}
