package Finance;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("shawn", "1515", 250000);
        Valuable account2 = new BankAccount("BoA", "B23515", 250000);

        //try to deposit money into both accounts
        account1.deposit(1);
        System.out.println(account1);

        account2.getValue();
        System.out.println(account2);
    }
}
