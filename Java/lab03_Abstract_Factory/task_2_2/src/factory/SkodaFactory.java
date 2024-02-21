package factory;

import bus.Bus;
import bus.BusSkoda;
import tram.TramSkoda;
import tram.Tram;
import trolleybus.TrolleybusSkoda;
import trolleybus.Trolleybus;

public class SkodaFactory implements Factory {
    @Override
    public Bus createBus() {
        return new BusSkoda();
    }
    @Override
    public Tram createTram() {
        return new TramSkoda();
    }
    @Override
    public Trolleybus createTrolleybus() {
        return new TrolleybusSkoda();
    }
}
