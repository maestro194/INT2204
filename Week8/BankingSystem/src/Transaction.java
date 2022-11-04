/**
 * The type Transaction.
 */
public class Transaction {
  /**
   * The constant TYPE_DEPOSIT_CHECKING.
   */
  public static final int TYPE_DEPOSIT_CHECKING = 0;
  /**
   * The constant TYPE_WITHDRAW_CHECKING.
   */
  public static final int TYPE_WITHDRAW_CHECKING = 1;
  /**
   * The constant TYPE_DEPOSIT_SAVINGS.
   */
  public static final int TYPE_DEPOSIT_SAVINGS = 2;
  /**
   * The constant TYPE_WITHDRAW_SAVINGS.
   */
  public static final int TYPE_WITHDRAW_SAVINGS = 3;

  /**
   * The Type.
   */
  protected int type;
  /**
   * The Amount.
   */
  protected double amount;
  /**
   * The Initial balance.
   */
  protected double initialBalance;
  /**
   * The Final balance.
   */
  protected double finalBalance;

  /**
   * Instantiates a new Transaction.
   *
   * @param type           the type
   * @param amount         the amount
   * @param initialBalance the initial balance
   * @param finalBalance   the final balance
   */
  public Transaction(int type, double amount, double initialBalance, double finalBalance) {
    this.type = type;
    this.amount = amount;
    this.initialBalance = initialBalance;
    this.finalBalance = finalBalance;
  }

  /**
   * Gets transaction type string.
   *
   * @param type the type
   * @return the transaction type string
   */
  public String getTransactionTypeString(int type) {
    switch (type) {
      case TYPE_DEPOSIT_CHECKING:
        return "Nạp tiền vãng lai";
      case TYPE_WITHDRAW_CHECKING:
        return "Rút tiền vãng lai";
      case TYPE_DEPOSIT_SAVINGS:
        return "Nạp tiền tiết kiệm";
      case TYPE_WITHDRAW_SAVINGS:
        return "Rút tiền tiết kiệm";
      default:
        return "";
    }
  }

  /**
   * Gets transaction summary.
   *
   * @return the transaction summary
   */
  public String getTransactionSummary() {
    String summary = "";

    summary += "- Kiểu giao dịch: " + getTransactionTypeString(this.type) + "."
        + " Số dư ban đầu: $" + balanceFormat(this.initialBalance) + "."
        + " Số tiền: $" + balanceFormat(this.amount) + "."
        + " Số dư cuối: $" + balanceFormat(this.finalBalance) + ".";

    return summary;
  }

  private String balanceFormat(double number) {
    return String.format("%.2f", number);
  }
}
