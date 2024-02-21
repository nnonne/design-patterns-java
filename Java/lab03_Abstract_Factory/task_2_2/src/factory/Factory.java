package factory;

import bus.Bus;
import tram.Tram;
import trolleybus.Trolleybus;

public interface Factory {
    Bus createBus();
    Tram createTram();
    Trolleybus createTrolleybus();
}
