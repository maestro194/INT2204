/**
 * The type Savings account.
 */
public class SavingsAccount extends Account {
  /**
   * Instantiates a new Savings account.
   *
   * @param accountNumber the account number
   * @param balance       the balance
   */
  public SavingsAccount(long accountNumber, double balance) {
    super(accountNumber, balance);
  }

  @Override
  public void withdraw(double amount) throws BankException {
    if (amount > 1000) {
      throw new InsufficientFundsException(amount);
    } else if (amount - 1000 < 5000) {
      throw new InsufficientFundsException(amount);
    }
    doWithdrawing(amount);
  }

  @Override
  public void deposit(double amount) throws BankException {
    doDepositing(amount);
  }
}
