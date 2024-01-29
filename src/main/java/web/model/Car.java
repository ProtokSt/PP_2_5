package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String model;

    private int series;

    private String licence;

    public Car() {
    }

    public Car(String model, int series, String licence) {
        this.model = model;
        this.series = series;
        this.licence = licence;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", licence='" + licence + '\'' +
                '}';
    }
}