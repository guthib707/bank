// Abstract class are pretty nice, I think.
abstract class Bank {
  // Always use protection.
  protected int accountNumber;
  protected String name;
  protected double balance;

  // I wish making a bank account was this easy.
  public Bank(int accountNumber, String name, double balance) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = balance;
  }

  // Bank's subclasses will take care of this.
  abstract void deposit(double amount);

  abstract void withdraw(double amount);

  abstract void displayInfo();
}