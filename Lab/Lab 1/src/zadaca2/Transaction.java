package zadaca2;

public class Transaction {
    protected long fromId;
    protected long toId;
    protected String description;
    protected String amount;

    public Transaction(long fromId, long toId, String description, String amount) {
        this.fromId = fromId;
        this.toId = toId;
        this.description = description;
        this.amount = amount;
    }

    public long FromId() {
        return fromId;
    }

    public long ToId() {
        return toId;
    }

    public String getAmount() {
        return amount;
    }
}
