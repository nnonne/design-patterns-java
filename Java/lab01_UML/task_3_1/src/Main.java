public class Main {
    public static void main(String[] args) {
        CarSimulator carSimulator = new CarSimulator(10, 500);
        carSimulator.buildCar();
        carSimulator.driveCar();
        carSimulator.stopCar();
    }
}