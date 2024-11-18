// Someone made a bank account, I guess.

abstract class Bank {
  protected int accountNumber;
  protected String name;
  protected double balance;

  public Bank(int accountNumber, String name, double balance) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = balance;
  }

  abstract void deposit(double amount);

  abstract void withdraw(double amount);

  abstract void displayInfo();
}