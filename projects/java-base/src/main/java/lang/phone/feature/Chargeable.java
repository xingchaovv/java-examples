package lang.phone.feature;

public interface Chargeable {

    default int chargeVersion() {
        return 1;
    }
}
