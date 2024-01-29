package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Override
    @SuppressWarnings("unchecked")
    public List<Car> listCars() {
        List<Car> ListCars;
        {
            ListCars = new ArrayList<>();
            ListCars.add(new Car("GAZ", 101, "A"));
            ListCars.add(new Car("UAZ", 102, "B"));
            ListCars.add(new Car("KAMAZ", 103, "C"));
            ListCars.add(new Car("ZIL", 104, "D"));
            ListCars.add(new Car("IJ", 105, "BE"));
        }
        return ListCars;
    }

}
