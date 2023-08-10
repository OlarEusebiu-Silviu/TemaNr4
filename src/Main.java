public class Main {
    public static void main(String[] args) {
        SamsungGalaxyS6 phone = new SamsungGalaxyS6(24, "Black", "Plastic");

        phone.addContact("1", "0458439429", "Olar", "Eusebiu");
        phone.addContact("2", "0743945932", "Sebastian", "Mihai");

        phone.sendMessage("0458439429", "Hello, Olar!");
        phone.call("0743945932");
    }
}