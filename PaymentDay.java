import java.time.LocalDate;

public class PaymentDay {

    String action;
    LocalDate date;

    public PaymentDay(String action, LocalDate date) {
        this.action = action;
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public LocalDate getDate() {
        return date;
    }

}
