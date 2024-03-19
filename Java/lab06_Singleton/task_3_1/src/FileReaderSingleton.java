import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class FileReaderSingleton {

    private static FileReaderSingleton instance = null;
    private static final Lock lock = new ReentrantLock();
    private String path;

    private FileReaderSingleton() {
    }

    public static FileReaderSingleton getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new FileReaderSingleton();
            }
            lock.unlock();
        }
        return instance;
    }

    public void setFile(String path) {
        this.path = path;
    }
    public void readFile() throws Exception {
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }
    public void writeLine(String line) throws Exception {
        FileWriter fileWriter = new FileWriter(path, true);
        fileWriter.write(line + "\n");
        fileWriter.close();
    }
    public void deleteLine(int index) throws Exception {
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);
        ArrayList<String> list = new ArrayList<String>();

        int i = 1;
        while (scanner.hasNextLine()) {
            if (i == index) {
                scanner.nextLine();
            }
            i++;
            list.add(scanner.nextLine());
        }

        FileWriter fileWriter = new FileWriter(path);
        for (int j = 0; j < list.size(); j++) {
            fileWriter.write(list.get(j) + "\n");
        }
        fileReader.close();
        fileWriter.close();
    }
}