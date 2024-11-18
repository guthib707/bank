// Oh, I see you made a savings account, huh?

public class Savings extends Bank {
  protected double interestRate;

  // Steal.
  public Savings(int accountNumber, String name, double balance, double interestRate) {
    super(accountNumber, name, balance);
    this.interestRate = interestRate;
  }

  // Your parent did not give you a body, so you must make one yourself, child.
  @Override
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited $" + amount + " to account number " + accountNumber);
      System.out.println("Old balance: $" + (balance - amount));
      balance += (balance * (interestRate / 100));
      System.out.println("New balance: $" + balance);
    } else
      System.out.println("Invalid input, perhaps you entered an invalid amount?");
  }

  @Override
  public void withdraw(double amount) {
    if (balance >= amount && amount > 0) {
      balance -= amount;
      System.out.println("Withdrew $" + amount + " to account number " + accountNumber);
      System.out.println("Old balance: $" + (balance + amount));
      System.out.println("New balance: $" + balance);
    } else
      System.out.println("Invalid input, perhaps you entered an invalid amount?");
  }

  @Override
  public void displayInfo() {
    System.out.println("Savings Account:");
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Name: " + name);
    System.out.println("Balance: $" + balance);
    System.out.printf("Interest Rate: %.0f%%\n", interestRate);
    System.out.println();
  }
}