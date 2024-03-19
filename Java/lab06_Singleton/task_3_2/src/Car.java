
public class Car {
    public enum CarColor {   // Колір автомобіля
        White,  //  Білий
        Black,  //  Чорний
        Red,    //  Червоний
        Grey    //  Сірий
    }

    public enum Type {  //  Тип кузову автомобіля
        Sedan,      //  Седан
        Hatchback,  //  Хетчбек
        SUV         //  Кросовер
    }

    final private Type type;          //  Тип кузову
    final private CarColor carColor;  //  Колір
    final private Engine engine;      //  Двигун
    final private Wheel wheel;        //  Колеса

    public Car(Type type, CarColor carColor,
               Engine engine, Wheel wheel) {
        this.type = type;
        this.carColor = carColor;
        this.engine = engine;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "type=" + type +
                ",\ncarColor=" + carColor +
                ",\nengine=" + engine +
                ",\nwheel=" + wheel +
                '\n';
    }

    public static class CarBuilder {

        private Type type;
        private CarColor carcolor;
        private Engine engine;
        private Wheel wheel;

        public CarBuilder setType(Type type) {
            this.type = type;
            return this;
        }
        CarBuilder setColor(CarColor color) {
            this.carcolor = color;
            return this;
        }
        CarBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }
        CarBuilder setWheel(Wheel wheel) {
            this.wheel = wheel;
            return this;
        }

        Car build() {
            return new Car(type, carcolor, engine, wheel);
        }
    }
}
