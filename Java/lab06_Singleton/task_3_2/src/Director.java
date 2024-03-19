import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Director {
    private static Director instance = null;
    private static final Lock lock = new ReentrantLock();

    private Director() {
    }

    public static Director getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new Director();
            }
            lock.unlock();
        }
        return instance;
    }

    Car buildCar1() {
        Car.CarBuilder carBuilder = new Car.CarBuilder();
        Engine.EngineBuilder engineBuilder = new Engine.EngineBuilder();
        Wheel.WheelBuilder wheelBuilder = new Wheel.WheelBuilder();

        return carBuilder
                    .setType(Car.Type.Hatchback)
                    .setColor(Car.CarColor.White)
                    .setEngine(engineBuilder
                            .setPower(150)
                            .setTorque(100)
                            .setFuel(Engine.Fuel.Petrol)
                            .setVolume(1.7f)
                            .build())
                    .setWheel(wheelBuilder
                            .setMaterial(Wheel.Material.Forged)
                            .setDiameter(17)
                            .build())
                .build();
    }

    Car buildCar2() {
        Car.CarBuilder carBuilder = new Car.CarBuilder();
        Engine.EngineBuilder engineBuilder = new Engine.EngineBuilder();
        Wheel.WheelBuilder wheelBuilder = new Wheel.WheelBuilder();

        return carBuilder
                .setType(Car.Type.SUV)
                .setColor(Car.CarColor.Red)
                .setEngine(engineBuilder
                        .setPower(100)
                        .setTorque(100)
                        .setFuel(Engine.Fuel.Diesel)
                        .setVolume(1.7f)
                        .build())
                .setWheel(wheelBuilder
                        .setMaterial(Wheel.Material.Steel)
                        .setDiameter(16)
                        .build())
                .build();
    }

    Car buildCar3() {
        Car.CarBuilder carBuilder = new Car.CarBuilder();
        Engine.EngineBuilder engineBuilder = new Engine.EngineBuilder();
        Wheel.WheelBuilder wheelBuilder = new Wheel.WheelBuilder();

        return carBuilder
                .setType(Car.Type.Sedan)
                .setColor(Car.CarColor.Black)
                .setEngine(engineBuilder
                        .setPower(100)
                        .setTorque(150)
                        .setFuel(Engine.Fuel.Electric)
                        .setVolume(1.6f)
                        .build())
                .setWheel(wheelBuilder
                        .setMaterial(Wheel.Material.Alloy)
                        .setDiameter(16)
                        .build())
                .build();
    }
}
