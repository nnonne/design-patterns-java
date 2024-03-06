public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
                .setString("start ")
                .addSymbols("end")
                .insertSymbols("middle ", 6);
        String string = stringBuilder.build();

        System.out.println(string);

    }
}