import java.time.LocalDate;

public class Payment {

    String action;
    LocalDate date;

    public Payment(String action, LocalDate date) {
        this.action = action;
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
