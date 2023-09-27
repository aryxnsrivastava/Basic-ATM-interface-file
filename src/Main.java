import java.util.*;

public class Main{
    public static void main(String[] args){


        //ArrayList
        ArrayList <Accounts> AccountList = new ArrayList<>();
        int optionType = 0;

        //Accounts
        Accounts one = new Accounts(1234, 123456789, 0, "Messi");
        Accounts two = new Accounts(4321, 987654321, 0, "Ronaldo");
        Accounts three = new Accounts(2222, 3333, 0, "Neymar");

        //adding accounts to array list.
        AccountList.add(one);
        AccountList.add(two);
        AccountList.add(three);

        //Scanner
        Scanner in = new Scanner(System.in);

        //ID
        System.out.println("Hi! please input your ID number -->");
        int IDnumber = in.nextInt();

        //PIN
        System.out.println("Please type in your password -->");
        int Password = in.nextInt();

        //Boolean variable initialisation to check if the account exists.
        boolean AccExists = false;

        for(int i = 0; i < AccountList.size(); i++) {
            if ((IDnumber == AccountList.get(i).accountNUMBER) && (Password == AccountList.get(i).pinCODE)) {

                facilities func = new facilities(AccountList.get(i).accountNUMBER, AccountList.get(i).pinCODE, AccountList.get(i).balance, AccountList.get(i).name);

                System.out.println("Welcome " + AccountList.get(i).name);
                AccExists = true;
                System.out.println();
                System.out.println();
                System.out.println("Please select one of the following options:");
                System.out.println("1: Deposit");
                System.out.println("2: Withdrawal");
                System.out.println("3: MiniStatement");
                System.out.println("4: Exit");

                while (optionType != 4){
                    optionType += in.nextInt();
                    switch (optionType) {
                        case 1:
                            System.out.println("Please input the amount you would like to deposit -->");
                            func.deposit(in.nextInt());
                            System.out.println("Would you like to use any other service?\n" +
                                    "if not then please press 4 to exit, Thankyou!");
                            optionType -= 1;
                             break;

                        case 2:
                            System.out.println("Please input the amount you would like to withdraw -->");
                            func.withdrawal(in.nextInt());

                            System.out.println("Would you like to use any other service?\n" +
                                    "if not then please press 4 to exit, Thankyou!");
                            optionType -= 2;
                            break;


                        case 3:
                            System.out.println("Your account balance is: " + func.getBalance());

                            System.out.println("Would you like to use any other service?\n" +
                                    "if not then please press 4 to exit, Thankyou!");
                            optionType -= 3;
                            break;

                    }

                }

                System.out.println("Thankyou for choosing our bank!");

            }
        }
        if(!AccExists){
            System.out.println("Account does not exist");
        }
    }
}

