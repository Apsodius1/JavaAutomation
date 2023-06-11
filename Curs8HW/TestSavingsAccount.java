import java.util.Scanner;

class Customer {
    private String name;
    private String address;
    private String email;

    public Customer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}

class InsuficientFundsException extends Exception {
    public InsuficientFundsException() {
        super("Insuficient funds for transaction");
    }
}

class Account {
    private int accountNumber;
    public double balance;
    public Customer accountOwner;

    public void withdrawMoney(double amount) {
        try {
            throw new InsuficientFundsException();
        } catch (InsuficientFundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // public int getAccountNumber() {
    // return accountNumber;
    // }
}

class SavingsAccount extends Account {
    private static int accountNumbers = 0;

    public SavingsAccount(Customer accountOwner, double balance) {
        this.accountOwner = accountOwner;
        this.balance = balance;
        this.setAccountNumber(++accountNumbers);
    }

    @Override
    public void withdrawMoney(double amount) {
        try {
            if (amount < 0) {
                System.out.println("Cannot withdraw a negative amount!");
            } else if (amount > this.balance) {
                throw new InsuficientFundsException();
            } else {
                this.balance -= amount;
                System.out.println("Please pick up your money!");
                System.out.println("New balance: " + this.balance);
            }
        } catch (InsuficientFundsException eFundsException) {
            System.out.println("The amount you entered is greater than the available balance: " + balance);

            System.out.println(eFundsException);
            ;
        } finally {
            System.out.println("Thank you for using our ATM");
        }
    }

}

class TestSavingsAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Customer augustin = new Customer("Augustin", "Bucharest", "ag@test.com");
        SavingsAccount augustinSavingsAccount = new SavingsAccount(augustin, 100.5);
        System.out.println("Hi " + augustin.getName());

        // System.out.println("Account number:" +
        // augustinSavingsAccount.getAccountNumber());

        System.out.print("Please enter the amount to withdraw: ");
        augustinSavingsAccount.withdrawMoney(input.nextDouble());

        input.close();
    }
}