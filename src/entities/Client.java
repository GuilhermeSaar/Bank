package entities;

public class Client {

    private String name;
    private int age;

    private SavingsAccount savingsAccount;
    private CurrentAccount currentAccount;

    public Client(String name, int age, SavingsAccount savingsAccount, CurrentAccount currentAccount) {
        this.name = name;
        this.age = age;
        this.savingsAccount = savingsAccount;
        this.currentAccount = currentAccount;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Cliente!%n" +
                "Nome: %s, Idade: %d, Saldo Conta Corrente: %.2f%nSaldo Conta-Poupança: %.2f", getName(), getAge(),
                getCurrentAccount().getBalance(), getSavingsAccount().getBalance());
    }
}
