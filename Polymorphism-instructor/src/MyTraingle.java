public class MyTraingle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTraingle(int x1,int y1,int x2, int y2,int x3,int y3){
        v1=new MyPoint(x1,y1);
        v2=new MyPoint(x2,y2);
        v3=new MyPoint(x3,y3);
    }

    public MyTraingle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTraingle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }
     public double getPerimeter(){
        return (v1.getX()+ v1.getY())+(v2.getX()+ v2.getY())+(v3.getX()+ v3.getY());
     }
}
