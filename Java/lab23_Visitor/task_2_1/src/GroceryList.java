import java.util.ArrayList;

public class GroceryList implements Groceries {

    final private ArrayList<Groceries> groceries = new ArrayList<>();

    public GroceryList() {
    }

    public ArrayList<Groceries> getGroceries() {
        return groceries;
    }

    void add(Groceries grocery){
        groceries.add(grocery);
    }

    @Override
    public double getPrice() {
        double sum = 0.0;
        for (Groceries grocery : groceries) {
            sum += grocery.getPrice();
        }
        return sum;
    }

    public void accept(PriceVisitor visitor){
        for (Groceries grocery: groceries){
            grocery.accept(visitor);
        }
    }

}
