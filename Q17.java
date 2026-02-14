class BankAccount{
    private int accountNumber;
    private double balance;
    private String password;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}


public class Q17 {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();

        bank.setAccountNumber(123);
        bank.setBalance(234.23);
        bank.setPassword("bhavan");

        System.out.println("Account no is " + bank.getAccountNumber());
        System.out.println("Balance is " + bank.getBalance());
        System.out.println("password is " + bank.getPassword());
    }
}
