import java.util.ArrayList;
import java.util.List;

class SamsungGalaxyS6 extends Telefon implements ContactManager, MessageManager, CallManager {
    private List<Contact> contacts;
    private List<Message> messages;
    private List<Call> callHistory;

    public SamsungGalaxyS6(int batteryLifeHours, String color, String material) {
        super(batteryLifeHours, color, material);
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.callHistory = new ArrayList<>();
    }

   

    @Override
    public void displayInfo() {
        System.out.println("Samsung Galaxy S6");
        System.out.println("Battery Life: " + batteryLifeHours + " hours");
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
    }

    @Override
    public void call(String phoneNumber) {

    }

    @Override
    public List<Call> viewHistory() {
        return null;
    }

    @Override
    public void addContact(String id, String phoneNumber, String firstName, String lastName) {

    }

    @Override
    public Contact getFirstContact() {
        return null;
    }

    @Override
    public Contact getLastContact() {
        return null;
    }

    @Override
    public void sendMessage(String phoneNumber, String messageContent) {

    }

    @Override
    public String getFirstMessage(String phoneNumber) {
        return null;
    }

    @Override
    public String getSecondMessage(String phoneNumber) {
        return null;
    }
}
