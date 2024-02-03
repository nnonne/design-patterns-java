public class CarSimulator {
    private Car car;
    private CarBuilder carBuilder;
    private int wheelRadius;
    private int power;

    public CarSimulator(int wheelRadius, int power) {
        car = new Car(wheelRadius, power);
        carBuilder = new CarBuilder();
    }

    public void buildCar() {
        carBuilder.buildCar(car);
    }
    public void driveCar() {
        System.out.println("You are driving the car");
    }
    public void stopCar() {
        System.out.println("You have stopped the car");
    }

}
