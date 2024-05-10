import java.util.ArrayList;
import java.util.List;

public class MessageMediator implements Mediator {

    private final List<Plane> planes = new ArrayList<>();

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    @Override
    public void broadcast(Plane from, String message) {
        for (Plane plane : planes) {
            if (plane.equals(from)) {
                continue;
            }
            plane.handleMessage(from, message);
        }
    }
}
