import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private final String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public void startRead() {
        Thread thread = new Thread(this::read);
        thread.start();
    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            reader.lines().forEach(this::onLineRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void onLineRead(String line) {
        notifySubscribers(line);
        System.out.println(line);
    }


    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    private void notifySubscribers(String line) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(line);
        }
    }
}