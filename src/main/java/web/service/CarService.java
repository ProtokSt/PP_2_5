package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {


    List<Car> returnLimitedCars(List<Car> listCars, int limit);
}