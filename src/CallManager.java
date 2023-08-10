import java.util.List;

interface CallManager {
    void call(String phoneNumber);
    List<Call> viewHistory();
}