import java.util.ArrayList;

public class Flyweight {
    static ArrayList<Engine> engines = new ArrayList<>();
    static ArrayList<Wheel> wheels = new ArrayList<>();

    public static Engine getEngine(int power, Engine.Fuel fuel) {
        for (Engine engine : engines) {
            if (engine.fuel == fuel && engine.power == power) {
                return engine;
            }
        }
        Engine engine = new Engine(power, fuel);
        engines.add(engine);
        return engine;
    }

    public static Wheel getWheel(int diameter) {
        for (Wheel wheel : wheels) {
            if (wheel.diameter == diameter) {
                return wheel;
            }
        }
        Wheel wheel = new Wheel(diameter);
        wheels.add(wheel);
        return wheel;
    }
}
