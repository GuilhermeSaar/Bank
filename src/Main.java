import entities.Client;
import entities.CurrentAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {


        SavingsAccount saving = new SavingsAccount(300, 200);
        CurrentAccount current = new CurrentAccount(301, 250);
        Client client1 = new Client("Guilherme", 25, saving, current);






        SavingsAccount saving1 = new SavingsAccount(400, 600);
        CurrentAccount current1 = new CurrentAccount(401, 200);
        Client client2 = new Client("Eduarda", 27, saving1, current1);


        client1.getCurrentAccount().transferCurrent(client2, 200);

        System.out.println(client1);
        System.out.println(client2);















    }
}