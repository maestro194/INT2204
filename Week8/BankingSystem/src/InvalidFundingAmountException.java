/**
 * The type Invalid funding amount exception.
 */
public class InvalidFundingAmountException extends BankException {
  /**
   * Instantiates a new Invalid funding amount exception.
   *
   * @param amount the amount
   * @throws BankException the bank exception
   */
  public InvalidFundingAmountException(double amount) throws BankException {
    super("Số tiền không hợp lệ: $" + amount);
  }
}
