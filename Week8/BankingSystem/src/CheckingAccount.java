/**
 * The type Checking account.
 */
public class CheckingAccount extends Account {
  /**
   * Instantiates a new Checking account.
   *
   * @param accountNumber the account number
   * @param balance       the balance
   */
  public CheckingAccount(long accountNumber, double balance) {
    super(accountNumber, balance);
  }

  @Override
  public void withdraw(double amount) throws BankException {
    doWithdrawing(amount);
  }

  @Override
  public void deposit(double amount) throws BankException {
    doDepositing(amount);
  }
}
