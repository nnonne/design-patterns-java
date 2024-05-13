public class ConcreteUser implements User {

    public enum Type {
        User,
        Moderator,
        Admin
    }

    final private String userId;
    private Mediator mediator;
    final private Type type;

    public ConcreteUser(String userId, Type type) {
        this.userId = userId;
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }
    public Type getUserType() {
        return type;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessageAll(String message) {
        if (mediator != null){
            mediator.sendAll(this, message);
        }
    }

    @Override
    public void sendMessage(String message, String userTo) {
        if (mediator != null){
            mediator.sendUser(this, userTo, message);
        }
    }

    @Override
    public void sendMessageGroup(String message, ConcreteUser.Type type) {
        if (mediator != null){
            mediator.sendGroup(this, type, message);
        }
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }
}
