public class Main {
    public static void main(String[] args) {

        Director director = Director.getInstance();

        Car car1 = director.buildCar1();
        Car car2 = director.buildCar2();
        Car car3 = director.buildCar3();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}