public class CarBuilder {
    public void buildCar(Car car) {
        System.out.println("The car has been built");
    }

    public void replaceWheel(Wheel wheel, Car car) {
        car.setWheel(wheel);
        System.out.println("The wheel has been replaced");
    }
    public void replaceEngine(Engine engine, Car car) {
        car.setEngine(engine);
        System.out.println("The engine was replaced");
    }

}