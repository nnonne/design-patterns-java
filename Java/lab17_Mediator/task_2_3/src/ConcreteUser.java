public class ConcreteUser implements User {

    final private String userId;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getUserId() {
        return userId;
    }

    public ConcreteUser(String userId) {
        this.userId = userId;
    }

    @Override
    public void sendMessageAll(String message) {
        if (mediator != null){
            mediator.sendMessageAll(this, message);
        }
    }

    @Override
    public void sendMessage(String message, String userTo) {
        if (mediator != null){
            mediator.sendMessage(this, userTo, message);
        }
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }
}
