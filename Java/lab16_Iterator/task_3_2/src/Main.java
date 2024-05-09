public class Main {

  public static void main(String[] args) {

    ShopItem pens = new ShopItem("pen", 1);
    ShopItem pencils = new ShopItem("pencil", 2);
    ShopItem paper = new ShopItem("paper", 3);

    Shop shop = new Shop();
    shop.putItem(pens);
    shop.putItem(pencils);
    shop.putItem(paper);

    Iterator iterator = new AlphabetOrderIterator(shop);
    while (iterator.hasMore()){
      System.out.println(iterator.getNext());
    }

    Iterator iterator2 = new AmountDecreaseIterator(shop);
    while (iterator2.hasMore()){
      System.out.println(iterator2.getNext());
    }
  }
}
