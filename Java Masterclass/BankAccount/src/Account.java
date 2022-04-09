public class Account {
    private String account;
    private double balance;
    private String customer;
    private String email;
    private String phone;

    public Account (){
        this("11111", 10, "Default name", "Default email", "Default phone");
    }
    public Account(String account, double balance, String customer, String email, String phone){
        this.account = account;
        this.balance = balance;
        this.customer = customer;
        this.email = email;
        this.phone = phone;
    }
    public Account(String customer, String email, String phone){
        this("99999", 100.55, customer, email, phone);

        this.customer = customer;
        this.email = email;
        this.phone = phone;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAccount() {
        return account;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomer() {
        return customer;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("You have deposited $" + amount + ". Your new balance is $" + this.balance + ".");
    }
    public void withdrawal(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Unable to withdraw $" + amount + ". Your current balance is $" + this.balance + ".");
        } else {
            this.balance -= amount;
            System.out.println("You have withdrawn $" + amount + " from your balance. Your new balance is $" + this.balance  + ".");
        }
    }
}
