public class Start {
    public static void main(String[] args) {
        Serial serial = new Serial("Friend", 3, 3);
        System.out.println(serial);
        System.out.println("===========================");
        SerialFactory copySerial = new SerialFactory(serial);
        Serial serialClone = copySerial.cloneSerial();
        System.out.println(serial);
    }
}
