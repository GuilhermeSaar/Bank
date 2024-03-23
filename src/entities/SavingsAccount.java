package entities;

public class SavingsAccount extends Account{

    private static final double TAX = 0.01;


    public SavingsAccount(int numberAccount, double balance) {
        super(numberAccount, balance);
    }

    // saque
    @Override
    public void withdraw(double amount) {
        this.balance -= amount + (amount * TAX);
    }


    // deposito
    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }


}

