package structure.adapter.adapter_c;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Voltage220V voltage220V = new Voltage220V();
        phone.charging(new VoltageAdapter(voltage220V));
    }
}
