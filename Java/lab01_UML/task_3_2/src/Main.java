public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Product product = creator.createProduct();
        product.doSomething();
    }
}
