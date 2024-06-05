public class Main {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab19_Observer\\task_3_1\\resources\\input01.txt");

        LongestLine longestLine = new LongestLine();
        LongestWord longestWord = new LongestWord();
        AmountWords amountWords = new AmountWords();

        fileReader.subscribe(longestLine);
        fileReader.subscribe(longestWord);
        fileReader.subscribe(amountWords);

        fileReader.startRead();

    }

}