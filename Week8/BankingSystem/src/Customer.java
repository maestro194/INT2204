import java.util.ArrayList;
import java.util.List;

/**
 * The type Customer.
 */
public class Customer {
  /**
   * The Id number.
   */
  protected long idNumber;
  /**
   * The Full name.
   */
  protected String fullName;
  /**
   * The Account list.
   */
  private List<Account> accountList = new ArrayList<>();

  /**
   * Instantiates a new Customer.
   */
  public Customer() {
    this.idNumber = 0;
    this.fullName = "";
  }

  /**
   * Instantiates a new Customer.
   *
   * @param idNumber the id number
   * @param fullName the full name
   */
  public Customer(long idNumber, String fullName) {
    this.idNumber = idNumber;
    this.fullName = fullName;
  }

  /**
   * Gets customer info.
   *
   * @return the customer info
   */
  public String getCustomerInfo() {
    String info = "";
    info += "Số CMND: " + this.idNumber + ". Họ tên: " + this.fullName + ".";
    return info;
  }

  /**
   * Add account.
   *
   * @param account the account
   */
  public void addAccount(Account account) {
    for (Account value : accountList) {
      if (account.equals(value)) {
        return;
      }
    }
    accountList.add(account);
  }

  /**
   * Remove account.
   *
   * @param account the account
   */
  public void removeAccount(Account account) {
    for (Account value : accountList) {
      if (account.equals(value)) {
        accountList.remove(account);
      }
    }
  }

  /**
   * Gets id number.
   *
   * @return the id number
   */
  public long getIdNumber() {
    return idNumber;
  }

  /**
   * Sets id number.
   *
   * @param idNumber the id number
   */
  public void setIdNumber(long idNumber) {
    this.idNumber = idNumber;
  }

  /**
   * Gets full name.
   *
   * @return the full name
   */
  public String getFullName() {
    return fullName;
  }

  /**
   * Sets full name.
   *
   * @param fullName the full name
   */
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * Gets account list.
   *
   * @return the account list
   */
  public List<Account> getAccountList() {
    return accountList;
  }
}
