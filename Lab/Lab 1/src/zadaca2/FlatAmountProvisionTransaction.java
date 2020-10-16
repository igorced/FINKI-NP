package zadaca2;

public class FlatAmountProvisionTransaction extends Transaction {
    public FlatAmountProvisionTransaction(long fromId, long toId, String description, String amount) {
        super(fromId, toId, description, amount);
    }
}
