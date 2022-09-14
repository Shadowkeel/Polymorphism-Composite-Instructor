public class Main {
    public static void main(String[] args) {
MyTraingle traingle1=new MyTraingle(2,2,3,3,4,4);
        System.out.println(traingle1.toString());
        System.out.println(traingle1.getPerimeter());
        MyPoint p1=new MyPoint(2,4);
        MyPoint p2=new MyPoint(3,6);
        MyPoint p3=new MyPoint(4,8);
        System.out.println("-----------");
        MyTraingle traingle2=new MyTraingle(p1,p2,p3);
        System.out.println(traingle2.toString());
        System.out.println(traingle2.getPerimeter());

    }


}