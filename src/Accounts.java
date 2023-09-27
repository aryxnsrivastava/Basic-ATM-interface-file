import java.util.ArrayList;

public class Accounts{

    //instance variables
    int accountNUMBER = 0;
    int pinCODE = 0;
    int balance = 0;

    String name = "";

    //constructor
    public Accounts(int accountNUMBER, int pinCODE, int balance, String name){
        this.accountNUMBER = accountNUMBER;
        this.pinCODE = pinCODE;
        this.balance = balance;
        this.name = name;
    }

    //setter
    public void setBalance(int balance){
        this.balance = balance;
    }

    //getter
    public int getBalance(){
        return balance;
    }
}

