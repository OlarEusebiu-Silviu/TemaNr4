interface ContactManager {
    void addContact(String id, String phoneNumber, String firstName, String lastName);
    Contact getFirstContact();
    Contact getLastContact();
}