public class Rectangle {
    public static int noofrectangles=0;
    private int len;
    private int width;

    public Rectangle(int a,int b)
    {
        noofrectangles+=1;
        this.len=a;
        this.width=b;

    }

    public Rectangle()
    {
        noofrectangles+=1;
        this.len=1;
        this.width=2;
    }
    public int area()
    {
        return  len*width;
    }
    public int perimeter()
    {
        System.out.println(len);
        System.out.println(width);
        return (2*(len+width));
    }
    public static int numberofrectangles()
    {
        return noofrectangles;
    }


}
