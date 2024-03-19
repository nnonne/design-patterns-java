public class Main {
    public static void main(String[] args) throws Exception {

        String path = "D:\\studying\\master\\2 сем\\design-patterns-java\\Java\\lab06_Singleton\\task_3_1\\src\\file.txt";
        FileReaderSingleton fileReaderSingleton = FileReaderSingleton.getInstance();

        fileReaderSingleton.setFile(path);

        System.out.println("Reading file:");
        fileReaderSingleton.readFile();

        System.out.println("Writing test:");
        fileReaderSingleton.writeLine("\nwriting test");
        fileReaderSingleton.readFile();

        System.out.println("Deleting a line:");
        fileReaderSingleton.deleteLine(1);
        fileReaderSingleton.readFile();

    }
}