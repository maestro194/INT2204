import java.util.ArrayList;
import java.util.List;

/**
 * The type Account.
 */
public abstract class Account {
  /**
   * The constant CHECKING.
   */
  public static final String CHECKING = "CHECKING";
  /**
   * The constant SAVINGS.
   */
  public static final String SAVINGS = "SAVINGS";
  /**
   * The Account number.
   */
  protected long accountNumber;
  /**
   * The Balance.
   */
  protected double balance;
  /**
   * The Transaction list.
   */
  protected List<Transaction> transactionList;

  /**
   * Instantiates a new Account.
   */
  public Account() {

  }

  /**
   * Instantiates a new Account.
   *
   * @param accountNumber the account number
   * @param balance       the balance
   */
  public Account(long accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.transactionList = new ArrayList<>();
  }

  /**
   * Gets account number.
   *
   * @return the account number
   */
  public long getAccountNumber() {
    return accountNumber;
  }

  /**
   * Gets balance.
   *
   * @return the balance
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Withdraw.
   *
   * @param amount the amount
   * @throws BankException the bank exception
   */
  public abstract void withdraw(double amount) throws BankException;

  /**
   * Deposit.
   *
   * @param amount the amount
   * @throws BankException the bank exception
   */
  public abstract void deposit(double amount) throws BankException;

  /**
   * Do withdrawing.
   *
   * @param amount the amount
   * @throws BankException the bank exception
   */
  public void doWithdrawing(double amount) throws BankException {
    if (amount < 0) {
      throw new InvalidFundingAmountException(amount);
    } else if (amount > balance) {
      throw new InsufficientFundsException(amount);
    }
    balance -= amount;
  }

  /**
   * Do depositing.
   *
   * @param amount the amount
   * @throws BankException the bank exception
   */
  public void doDepositing(double amount) throws BankException {
    if (amount < 0) {
      throw new InvalidFundingAmountException(amount);
    }
    balance += amount;
  }

  /**
   * Gets transaction history.
   *
   * @return the transaction history
   */
  public String getTransactionHistory() {
    String history = "";
    history += "Lịch sử giao dịch của tài khoản " + accountNumber + ":\n";

    for (int i = 0; i < transactionList.size(); i++) {
      history += transactionList.get(i).getTransactionSummary() + '\n';
    }

    return history;
  }

  /**
   * Add transaction.
   *
   * @param transaction the transaction
   */
  public void addTransaction(Transaction transaction) {
    transactionList.add(transaction);
  }

  public boolean equals(Object obj) {
    if (obj instanceof Account)
      return (this.accountNumber == ((Account) obj).accountNumber);
    return false;
  }

}
