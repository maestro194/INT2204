import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The type Bank.
 */
public class Bank {
  private List<Customer> customerList;

  /**
   * Read customer list.
   *
   * @param inputStream the input stream
   */
  public void readCustomerList(InputStream inputStream) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
    customerList = new ArrayList<>();

    String str = "";
    int i = 0;
    Customer tempCustomer = new Customer();
    Account tempAccount;
    String tempName;
    String tempType;
    int tempId;
    boolean flag = false;
    double tempBalance;
    double tempNum;

    while (true) {
      try {
        if (!reader.ready()) break;
        str = reader.readLine();
        i = 0;
      } catch (IOException e) {
        throw new RuntimeException(e);
      }

      if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
        // account number
        tempId = 0;
        while (!(str.charAt(i) == ' ')) {
          tempId = tempId * 10 + (str.charAt(i++) - '0');
        }

        // passing space;
        i++;

        // type of account
        tempType = "";
        while (!(str.charAt(i) == ' ')) {
          tempType += str.charAt(i++);
        }

        // passing space
        i++;

        // balance
        tempBalance = 0;
        tempNum = 0;
        while (i < str.length()) {
          if (str.charAt(i) == '.') {
            tempNum = 1;
          } else {
            tempNum /= 10;
            tempBalance = tempBalance * 10 + (str.charAt(i) - '0');
          }
          i++;
        }

        if (tempNum != 0) {
          tempBalance /= tempNum;
        }

        // add account
        if (tempType.equals(Account.CHECKING)) {
          tempAccount = new CheckingAccount(tempId, tempBalance);
        } else {
          tempAccount = new SavingsAccount(tempId, tempBalance);
        }
        tempCustomer.addAccount(tempAccount);

      } else {
        // add previous customer
        if (!flag) {
          flag = true;
        } else {
          customerList.add(tempCustomer);
          tempCustomer = new Customer();
        }

        // name
        tempName = "";
        while (!(str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9')) {
          tempName += str.charAt(i++);
        }

        // passing space
        i++;

        // set customer name
        tempCustomer.setFullName(tempName);

        // id
        tempId = 0;
        while (i < str.length()) {
          tempId = tempId * 10 + (str.charAt(i++) - '0');
        }

        // set customer id
        tempCustomer.setIdNumber(tempId);
      }
    }
  }

  /**
   * Gets customer s info by name order.
   *
   * @return the customer s info by name order
   */
  public String getCustomersInfoByNameOrder() {
    Collections.sort(customerList, Comparator.comparing(o -> o.fullName));

    String info = "";
    for (int i = 0; i < customerList.size(); i++) {
      info += customerList.get(i).getCustomerInfo() + '\n';
    }

    return info;
  }

  /**
   * Gets customers info by id order.
   *
   * @return the customers info by id order
   */
  public String getCustomersInfoByIdOrder() {
    Collections.sort(customerList, Comparator.comparing(o -> o.idNumber));

    String info = "";
    for (int i = 0; i < customerList.size(); i++) {
      info += customerList.get(i).getCustomerInfo() + '\n';
    }

    return info;
  }

  /**
   * Gets customer list.
   *
   * @return the customer list
   */
  public List<Customer> getCustomerList() {
    return customerList;
  }
}
