/**
 * The type Insufficient funds exception.
 */
public class InsufficientFundsException extends BankException {
  /**
   * Instantiates a new Insufficient funds exception.
   *
   * @param amount the amount
   * @throws BankException the bank exception
   */
  public InsufficientFundsException(double amount) throws BankException {
    super("Số dư tài khoản không đủ $" + amount + " để thực hiện giao dịch");
  }
}
