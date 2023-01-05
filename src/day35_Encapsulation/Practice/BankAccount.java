package day35_Encapsulation.Practice;

public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    /*
    3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments


     */

    public BankAccount(String accountHolder, long accountNumber, double balance) {
      setAccountHolder(accountHolder);
      setBalance(balance);
      setAccountNumber(accountNumber);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your current balance is: " + balance);
    }
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Depositing amount can not be zero or negative");
            return; // exits the method
        }

        balance += amount;
    }

    public void withdraw(double amount){
        if(amount > balance){ // if withdrawing amount is greater than available balance
            System.out.println("Insufficient balance");
            return;
        }

        if(amount <= 0){ // if withdrawing amount is negative or zero
            System.out.println("Withdrawing amount can not be negative or zero");
            return;
        }

        balance -= amount;
    }
}
