public class LongestWord implements Subscriber {

    private int amount = 0;
    private String maxWord = "";
    private String lineWithMaxWord = "";

    @Override
    public void update(String line) {
        String[] words = line.split("\\s+");
        boolean isFound = false;
        for (String word : words) {
            if (word.length() > amount) {
                isFound = true;
                amount = word.length();
                maxWord = word;
                lineWithMaxWord = line;
            }
        }

        if (isFound) {
            System.out.println("Знайдене довше слово \"" + maxWord + "\" з " + amount + " символів.");
            System.out.println("Знайдений рядок в якому міститься найбільше слово \"" + lineWithMaxWord + "\"");
        }
    }

    public String getMaxWord() {
        return maxWord;
    }
    public String getLineWithMaxWord() {
        return lineWithMaxWord;
    }

}
