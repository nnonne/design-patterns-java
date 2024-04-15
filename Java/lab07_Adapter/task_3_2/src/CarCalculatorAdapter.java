import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

class CarCalculatorAdapter implements VehicleCalculator {
    private final VehicleCalculator carCalculator;
    private static final int exchangeRate = 40;
    public static int averageCarPrice = 6000* exchangeRate;
    private Vehicle vehicle;

    public CarCalculatorAdapter(VehicleCalculator carCalculator) {
        this.carCalculator = carCalculator;
    }


    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String calculatePrice() {
        assert this.vehicle != null;

        int price = (int)(this.vehicle.getDamage() * (float)Math.max(this.getRetailPrice() - this.vehicle.getAge() * 100, 0));
        return "" + price*exchangeRate + "UAH";
    }

    public int getRetailPrice() {
        assert this.vehicle != null;

        switch (this.vehicle.getModel()) {
            case "Ford":
                return 3000;
            case "Audi":
                return 5000;
            case "BMW":
                return 7000;
            case "Tesla":
                return 10000;
            default:
                return averageCarPrice;
        }
    }
}