import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {

    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendAll(User from, String message) {
        String id = "";
        if (from instanceof ConcreteUser){
            ConcreteUser concreteUser = (ConcreteUser) from;
            id = concreteUser.getUserId();
        }

        for (User user : users) {
            if (user.equals(from)) {
                continue;
            }
            user.receiveMassage(message, id);
        }
    }

    @Override
    public void sendUser(User from, String to, String message) {
        String id = "";
        if (from instanceof ConcreteUser){
            ConcreteUser concreteUser = (ConcreteUser) from;
            id = concreteUser.getUserId();
        }
        getUserById(to).receiveMassage(message, id);
    }

    @Override
    public void sendGroup(User from, ConcreteUser.Type type, String message) {
        String id = "";
        if (from instanceof ConcreteUser){
            ConcreteUser concreteUser = (ConcreteUser) from;
            id = concreteUser.getUserId();
        }
        for (User user : users) {
            if (user.equals(from)) {
                continue;
            }
            ConcreteUser.Type t = ConcreteUser.Type.User;
            if (from instanceof ConcreteUser){
                ConcreteUser u = (ConcreteUser) user;
                t = u.getUserType();
            }
            if (t != type) {
                continue;
            }
            user.receiveMassage(message, id);
        }
    }

    public User getUserById(String id) {
        for (User user : users) {
            String user_id = "";
            if (user instanceof ConcreteUser){
                ConcreteUser concreteUser = (ConcreteUser) user;
                user_id = concreteUser.getUserId();
                if (id.equals(user_id)) {
                    return user;
                }
            }
        }
        return new ConcreteUser(id, ConcreteUser.Type.User);
    }
}
