package entities;

public class CurrentAccount extends Account{

    private static final double TAX = 0.02;


    public CurrentAccount(int numberAccount, double balance) {
        super(numberAccount, balance);
    }



    // saque
    @Override
    public void withdraw(double amount) {

        this.balance -= amount;
    }


    // deposito
    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }



    // transferencia
    public void transferCurrent(Client client, double amount) {

        if (getBalance() >= amount) {
            balance -= amount + (amount * TAX);

            client.getCurrentAccount().deposit(amount);
        }

        else
        {
            System.out.println("Saldo insuficiente");
        }


    }

}
