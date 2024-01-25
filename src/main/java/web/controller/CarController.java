package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    List<Car> ListCars;

    {
        ListCars = new ArrayList<>();
        ListCars.add(new Car("GAZ", 101, "A"));
        ListCars.add(new Car("UAZ", 102, "B"));
        ListCars.add(new Car("KAMAZ", 103, "C"));
        ListCars.add(new Car("ZIL", 104, "D"));
        ListCars.add(new Car("IJ", 105, "BE"));
    }

    @GetMapping(value = "/cars")
    public String printListedCars(ModelMap model, @RequestParam(defaultValue = "5") int count) {
        CarServiceImpl carService = new CarServiceImpl();
        List<Car> limitedListCars = carService.returnLimitedCars(ListCars, Math.abs(count));
        List<String> messages = new ArrayList<>();
        messages.add("This is Cars List page");
        messages.add("Limited by : " + Math.abs(count));
        model.addAttribute("messages", messages);
        model.addAttribute("cars", limitedListCars);
        return "cars";
    }

}