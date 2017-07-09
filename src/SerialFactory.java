public class SerialFactory {
    Serial serial;

    public SerialFactory(Serial serial) {
        this.serial = serial;
    }

    public void setSerial(Serial serial) {
        this.serial = serial;
    }

    Serial cloneSerial() {
        return (Serial) serial.copy();
    }

}
