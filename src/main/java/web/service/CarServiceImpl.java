package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> returnLimitedCars(List<Car> listCars, int limit) {
        return listCars.stream().limit(limit).toList(); // .collect(Collectors.toList()); Если список нужен изменяемый
    }
}
