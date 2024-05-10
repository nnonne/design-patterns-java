import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        final Box root = new Box(-999);

        for (int j = 0; j < 10; j++) {
            final Box box = new Box(j);
            root.add(box);
            for (int i = 0; i < 10; i++) {

                String name = String.format("Item_%s", j * 10 + i);
                int value = random.nextInt(1000);
                final Item item = new Item(name, value);
                box.add(item);
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        IteratorDepth iterator = new IteratorDepth(root);
        System.out.println("Depth iteration");
        while (iterator.hasMore()) {
            Component component = iterator.getNext();
            System.out.println(component);
        }

        System.out.println("Width iteration");
        IteratorWidth iterator2 = new IteratorWidth(root);
        while (iterator2.hasMore()) {
            Component component = iterator2.getNext();
            System.out.println(component);
            if (component instanceof Item) {
                Item item = (Item) component;
                int value = item.getValue();
                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
            }
        }

        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);

    }
}