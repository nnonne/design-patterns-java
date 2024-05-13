public interface Mediator {
    void addUser(User user);
    void sendMessageAll(User from, String message);
    void sendMessage(User from, String to, String message);
}
