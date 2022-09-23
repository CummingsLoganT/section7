import java.util.Arrays;

public class Dealership {
    private  Car[] cars;

    public Dealership() {
        this.cars = new Car[3];
    }

    public void setCar(Car car , int index) {
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index) {
        return this.cars[index];
    }

    public void sell(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }

    public String search(String make , int budget) {

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= budget) {

            }
        }

        return "Sorry, we couldn't find any cars.";
    }


}
