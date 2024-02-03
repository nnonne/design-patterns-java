public class Car {
    private Wheel wheel;
    private Engine engine;

    public Car(int wheelRadius, int power) {
        wheel = new Wheel(wheelRadius);
        engine = new Engine(power);
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }
}