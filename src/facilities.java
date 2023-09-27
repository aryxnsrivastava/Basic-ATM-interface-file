import java.util.*;
public class facilities extends Accounts{
    public facilities(int accountNUMBER, int pinCODE, int balance, String name){
        super(accountNUMBER, pinCODE, balance, name);
    }

    public void deposit(int depositAmount){
        this.balance += depositAmount;
        System.out.println("The new balance is: " + this.balance);
    }

    public void withdrawal(int withdrawalAmount){
        if(this.balance >  withdrawalAmount){
            this.balance -= withdrawalAmount;
            System.out.println("your new balance is: " + this.balance);
        }
        else{
            System.out.println("Insufficient funds available!");
        }
    }
}
