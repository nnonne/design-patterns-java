public class AmountWords implements Subscriber {

    private int amount = 0;

    @Override
    public void update(String line) {
        String[] words = line.split("\\s+");
        if (words.length > 0) {
            amount += words.length;
            System.out.println("Знайдені нові слова у файлі. Загальна кількість=" + amount);
        }
    }

    public int getAmountOfWords() {
        return amount;
    }

}
