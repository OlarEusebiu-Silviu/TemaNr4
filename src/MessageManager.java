interface MessageManager {
    void sendMessage(String phoneNumber, String messageContent);
    String getFirstMessage(String phoneNumber);
    String getSecondMessage(String phoneNumber);
}