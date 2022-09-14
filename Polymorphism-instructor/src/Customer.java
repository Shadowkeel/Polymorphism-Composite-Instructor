public class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
       if (gender=='m'||gender=='f'){
        this.gender = gender;}
       else {
           System.out.println("gender must be male or female");
       }
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID= " + ID +
                " name= " + name +" gender= " + gender+"}";
    }
}
