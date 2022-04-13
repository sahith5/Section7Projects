public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r2=new Rectangle();
        Rectangle r1=new Rectangle(2,3);
        int p1=r1.perimeter();
        System.out.println(p1);
       System.out.println(Rectangle.numberofrectangles());
    }
}
