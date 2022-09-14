public class Main {
    public static void main(String[] args) {
CustomerD customerD=new CustomerD(1,"Mohamed",15);
Invoice invoice=new Invoice(1,customerD,2500);
            System.out.println("invoice amount is: "+invoice.getAmount());
            System.out.println(invoice.getCustomerName());
    invoice.getCustomerDiscount();
            System.out.println("amount after discount= "+invoice.getAmmountAfterDiscount());
            System.out.println(invoice.toString());
    }


}