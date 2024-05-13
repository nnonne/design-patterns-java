public interface User {
    void sendMessageAll(String message);
    void sendMessage(String message, String userTo);
    void receiveMassage(String message, String userFrom);
    void sendMessageGroup(String message, ConcreteUser.Type type);
}
