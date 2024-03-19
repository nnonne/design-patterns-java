public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(105, 140, Engine.Fuel.Petrol, 1.4f);
        Wheel wheel = new Wheel(Wheel.Material.Steel, 14);
        Car car = new Car(Car.Type.Sedan, Car.CarColor.White, engine, wheel);

        System.out.println("Original car");
        System.out.println(car);

        Engine engineCopy = engine.clone();
        Wheel wheelCopy = wheel.clone();
        Car carCopy = car.clone();
        Car carCopy2 = new Car(Car.Type.Sedan, Car.CarColor.White, engineCopy, wheelCopy);

        System.out.println("Copy of the original car:");
        System.out.println(carCopy);

        System.out.println("A car that was made from copied engine and wheel:");
        System.out.println(carCopy2);

    }
}
