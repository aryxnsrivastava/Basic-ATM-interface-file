import java.util.*;
public class facilities extends Accounts{

    //constructor
    public facilities(int accountNUMBER, int pinCODE, int balance, String name){
        super(accountNUMBER, pinCODE, balance, name);
    }

    
    //method to deposit money
    public void deposit(int depositAmount){
        this.balance += depositAmount;
        System.out.println("The new balance is: " + this.balance);
    }


    //method to withdraw money if there's enough balance left.
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
