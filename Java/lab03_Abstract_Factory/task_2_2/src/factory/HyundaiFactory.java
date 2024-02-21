package factory;

import bus.Bus;
import bus.BusHyundai;
import tram.TramHyundai;
import tram.Tram;
import trolleybus.TrolleybusHyundai;
import trolleybus.Trolleybus;

public class HyundaiFactory implements Factory {
    @Override
    public Bus createBus() {
        return new BusHyundai();
    }
    @Override
    public Tram createTram() {
        return new TramHyundai();
    }
    @Override
    public Trolleybus createTrolleybus() {
        return new TrolleybusHyundai();
    }
}
