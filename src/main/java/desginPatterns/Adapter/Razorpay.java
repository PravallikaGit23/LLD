package desginPatterns.Adapter;

public class Razorpay implements BankApi {

    @Override
    public double checkBalance() {
        // call check balance api for razorpay
        return 0.00;
    }

    @Override
    public boolean deposit() {
        return false;
    }

    @Override
    public String withdraw() {
        return null;
    }

}
