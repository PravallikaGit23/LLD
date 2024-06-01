package desginPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        BankApi bankApi = new IntuitPay();
        bankApi.checkBalance();
        bankApi.withdraw();
        bankApi.deposit();
    }



}
