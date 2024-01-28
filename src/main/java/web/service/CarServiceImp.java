package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CarServiceImp implements CarService {

    private CarDao carDao;

    public CarServiceImp() {
    }

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> listCars(int limit) {
        return carDao.listCars().stream().limit(limit).toList(); // .collect(Collectors.toList()); Если список нужен изменяемый
    }
}
