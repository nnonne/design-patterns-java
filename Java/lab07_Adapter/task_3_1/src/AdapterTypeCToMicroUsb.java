import com.mobile.Legacy.MicroUsbCharger;

public class AdapterTypeCToMicroUsb implements MicroUsbCharger {

    final FastCharge fastCharge;
    public AdapterTypeCToMicroUsb(FastCharge fastCharge) {
        this.fastCharge = fastCharge;
    }

    @Override
    public float getOutputVoltage() {
        return this.fastCharge.getOutputPower();
    }

    @Override
    public float getOutputAmperage() {
        return this.fastCharge.getOutputPower();
    }
}
