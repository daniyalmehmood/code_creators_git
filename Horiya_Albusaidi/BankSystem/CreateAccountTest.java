import java.util.List;

public class CreateAccountTest {
    private String name;
    private String phone;
    double balance=0.0;
    private String state;
    private String civilId;
    private Double userId;
    private List<String> transactionsHistory;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCivilId() {
        return civilId;
    }

    public void setCivilId(String civilId) {
        this.civilId = civilId;
    }

    public Double getUserId() {
        return userId;
    }

    public void setUserId(Double userId) {
        this.userId = userId;
    }

    public List<String> getTransactionsHistory() {
        return transactionsHistory;
    }

    public void setTransactionsHistory(List<String> transactionsHistory) {
        this.transactionsHistory = transactionsHistory;
    }

    @Override
    public String toString() {
        return "{" +

                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", balance=" + balance +
                ", state='" + state + '\'' +
                ", civilId='" + civilId + '\'' +
                ", Transaction History='" + transactionsHistory +
                '}';
    }
}
