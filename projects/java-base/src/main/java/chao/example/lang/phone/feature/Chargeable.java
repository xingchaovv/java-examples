package chao.example.lang.phone.feature;

public interface Chargeable {

    default int chargeVersion() {
        return 1;
    }
}
