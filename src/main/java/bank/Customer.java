package bank;

public class Customer {
  private int id;
  private String name;
  private String userName;
  private String password;
  private int accountID;
  private boolean authenticated;

  public Customer(int id, String name, String userName, String password, int accountId) {
    setId(id);
    setName(name);
    setUserName(userName);
    setPassword(password);
    setAccountId(accountId);
    setAuthenticated(false);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAccountId() {
    return this.accountID;
  }

  public void setAccountId(int accounID) {
    this.accountID = accounID;
  }

  public boolean isAuthenticated() {
    return this.authenticated;
  }

  public void setAuthenticated(boolean authenticated) {
    this.authenticated = authenticated;
  }

  
}
