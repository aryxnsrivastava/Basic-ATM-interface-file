import java.util.ArrayList;

public class Accounts{
    int accountNUMBER = 0;
    int pinCODE = 0;
    int balance = 0;

    String name = "";

    public Accounts(int accountNUMBER, int pinCODE, int balance, String name){
        this.accountNUMBER = accountNUMBER;
        this.pinCODE = pinCODE;
        this.balance = balance;
        this.name = name;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
}

