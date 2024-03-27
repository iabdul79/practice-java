public class Account {

  String id;
  String name;
  int balance;

  public Account (String id, String name) {
    this.id = id;
    this.name = name;
    this.balance = 0;
  }

  public Account (String id, String name, int amount) {
    this.id = id;
    this.name = name;
    this.balance = amount;
  }

  public String getAccountId() {
    return id;
  }

  public String getAccountName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }


  public int credit(int amount) {
    balance += amount;
    return balance;
  }

  public int debit(int amount) {
    balance -= amount;
    return balance;
  }

  public String transferTo(String id, int amount) {
    if (amount > balance) {
      return "No sufficient balance";
    }
    int remainingBalance = debit(amount);
    return "Amount transferred to " + id +". Remaining balance: " + remainingBalance;
  }

  public String toString() {
    return "{" +
        " Account Id: " + id +
        " Account Name: " + name +
        " Balance: " + balance +
        "}";
  }
}
