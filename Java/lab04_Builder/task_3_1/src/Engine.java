
public class Engine {
    public enum Fuel {  // Тип пального
        Petrol,    // Бензин
        Diesel,    // Дізель
        Electric   // Електрика
    }

    final int power;     //  Потужність
    final int torque;    //  Крутний момент
    final Fuel fuel;     //  Вид пального
    final float volume;  //  Об'єм двигуна

    public Engine(int power, int torque, Fuel fuel, float volume) {
        this.power = power;
        this.torque = torque;
        this.fuel = fuel;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", torque=" + torque +
                ", fuel=" + fuel +
                ", volume=" + volume +
                '}';
    }

    public static class EngineBuilder {

        int power;
        int torque;
        Fuel fuel;
        float volume;

        EngineBuilder setPower(int power) {
            this.power = power;
            return this;
        }
        EngineBuilder setTorque(int torque) {
            this.torque = torque;
            return this;
        }
        EngineBuilder setFuel(Fuel fuel) {
            this.fuel = fuel;
            return this;
        }
        EngineBuilder setVolume(float volume) {
            this.volume = volume;
            return this;
        }

        Engine build() {
            return new Engine(power, torque, fuel, volume);
        }
    }

}
