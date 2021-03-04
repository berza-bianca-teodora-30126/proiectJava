package Factory;

public class Logistics {
    String type;
    Integer amount;

    public Logistics(String type, Integer amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}
