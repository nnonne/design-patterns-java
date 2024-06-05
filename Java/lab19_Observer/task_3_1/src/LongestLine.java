public class LongestLine implements Subscriber {

    private int amount = 0;
    private String maxLine = "";

    @Override
    public void update(String line) {
        if (line.length() > amount) {
            amount = line.length();
            maxLine = line;
            System.out.println("Знайдений довший рядок з " + amount + " символів.");
        }
    }

    public String getMaxLine() {
        return maxLine;
    }

}
