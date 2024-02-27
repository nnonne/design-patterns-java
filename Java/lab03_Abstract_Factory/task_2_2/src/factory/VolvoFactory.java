package machinefactory;

import bus.Bus;
import bus.BusVolvo;
import tram.Tram;
import tram.TramVolvo;
import trolleybus.Trolleybus;
import trolleybus.TrolleybusVolvo;

public class VolvoFactory implements Factory {
    @Override
    public Bus createBus() {
        return new BusVolvo();
    }
    @Override
    public Tram createTram() {
        return new TramVolvo();
    }
    @Override
    public Trolleybus createTrolleybus() {
        return new TrolleybusVolvo();
    }
}
