public class Client {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        groceryList.add(new Bread());
        groceryList.add(new Bread());
        groceryList.add(new Milk());
        groceryList.add(new Coffee());
        groceryList.add(new Chocolate());

        System.out.println("Total price of grocery list: " + groceryList.getPrice());

        groceryList.accept(new DiscountVisitor());
        System.out.println("Total price of grocery list after discounting: " + groceryList.getPrice());

        groceryList.accept(new IncreasePriceVisitor());
        System.out.println("Total price of grocery list after increasing: " + groceryList.getPrice());



    }

}
