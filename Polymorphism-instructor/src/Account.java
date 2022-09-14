public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("deposit successful");
    }
    public void withdraw(double amount){
        if (balance>=amount){
            balance -=amount;
        System.out.println("withdraw successful");
        }else {
            System.out.println("insufficient funds");
        }
    }
    public void transfer(double amount,Account account){
        if (balance>=amount){
            balance-=amount;
            account.setBalance(account.getBalance()+amount);
            System.out.println("transfer successful");
        }else {
            System.out.println("insufficient funds");
        }
    }

}
