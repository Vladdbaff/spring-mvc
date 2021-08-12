package web.model;

public class Car {
    private String model;
    private int number;
    private String series;

    public Car(){}

    public Car(String model, int number, String series) {
        this.model = model;
        this.number = number;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", series='" + series + '\'' +
                '}';
    }
}
