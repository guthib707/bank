public class Main {
  public static void main(String[] args) {
    Checking acc1 = new Checking(10001, "Steve", 1000, 100);
    Savings acc2 = new Savings(10002, "Alex", 1000, 1);
    acc1.displayInfo();
    acc2.displayInfo();
  }
}