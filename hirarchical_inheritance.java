class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Derived class
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * interestRate;
    }
}

// Another derived class
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double lst_amnt = balance + overdraftLimit;
        if (amount >= lst_amnt) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}


public class hirarchical_inheritance {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000, 0.05);
        savings.addInterest();
        System.out.println("Savings Account Balance: " + savings.getBalance());

        CurrentAccount current = new CurrentAccount(500, 200);
        current.withdraw(600);
        System.out.println("Current Account Balance: " + current.getBalance());
    }
}
