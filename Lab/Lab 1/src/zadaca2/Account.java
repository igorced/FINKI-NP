package zadaca2;

import java.util.Random;

public class Account {
    private String name;
    private long id;
    private String balance;

    public Account(String name, String balance) {
        this.name = name;
        this.balance = balance;
        this.id = new Random().nextLong();
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
