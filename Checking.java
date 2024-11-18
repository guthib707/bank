// Recipe for disaster.

public class Checking extends Bank {
  protected double overdraftLimit;

  public Checking(int accountNumber, String name, double balance, double overdraftLimit) {
    super(accountNumber, name, balance);
    this.overdraftLimit = overdraftLimit;
  }

  @Override
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited $" + amount + " to account number " + accountNumber);
      System.out.println("Old balance: $" + (balance - amount));
      System.out.println("New balance: $" + balance);
    } else
      System.out.println("Invalid input, perhaps you entered an invalid amount?");
  }

  @Override
  public void withdraw(double amount) {
    if (balance + overdraftLimit >= amount && amount > 0) {
      balance -= amount;
      System.out.println("Withdrew $" + amount + " to account number " + accountNumber);
      System.out.println("Old balance: $" + (balance + amount));
      System.out.println("New balance: $" + balance);
    } else
      System.out.println("Invalid input, perhaps you entered an invalid amount?");
  }

  @Override
  public void displayInfo() {
    System.out.println("Checking Account:");
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Name: " + name);
    System.out.println("Balance: $" + balance);
    System.out.println("Overdraft Limit: " + overdraftLimit);
    System.out.println();
  }
}