package entities;



public abstract class Account {


    protected final int AGENCY = 283;
    private int numberAccount;

    protected double balance = 0.0;


    public Account(int numberAccount, double balance) {
        this.numberAccount = numberAccount;
        this.balance = balance;
    }

    public int getAGENCY() {
        return AGENCY;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }



    // saque
    public abstract void withdraw(double amount);

    // deposito
    public abstract void deposit(double amount);


    // transfer
    public void transfer(Client client, double amount) {
        throw new UnsupportedOperationException(
                "Transfer operation not supported by this account type.");
    }


}
