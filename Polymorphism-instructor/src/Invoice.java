public class Invoice {
    private int id;
    private CustomerD customer;
    private double amount;

    public Invoice(int id, CustomerD customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomerD getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerD customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId(){
        return customer.getId();
    }
    public String getCustomerName(){
        return "Customer Name is: "+customer.getName();
    }
    public void getCustomerDiscount(){
        System.out.println("the Customer discount rate is: "+customer.getDiscount()+"%");
    }
    public double getAmmountAfterDiscount(){
     double newAmount=(customer.getDiscount()*amount)/100;

        return   amount-=newAmount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }
}
