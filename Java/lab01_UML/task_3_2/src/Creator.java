import java.util.Random;

public class Creator {
    public void someOperation() {
        System.out.println("Creator has done some operation");
    }

    public Product createProduct() {
        Random random = new Random();
        boolean b = random.nextBoolean();
        if (b) return new Product1();
        return new Product2();
    }
}
