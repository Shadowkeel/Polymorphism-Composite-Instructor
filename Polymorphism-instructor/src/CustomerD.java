public class CustomerD {
    private int id;
    private String name;
    private int discount;

    public CustomerD() {
    }

    public CustomerD(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "CustomerD{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discount %=" + discount +
                '}';
    }
}
