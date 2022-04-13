import java.time.*;
import java.util.Date;


 class Strings {

     public void insert(StringBuffer sb,int a,String s)
     {
         sb.insert(a,s);
     }

     public  void append (StringBuffer sb,String S) {
         sb.append(S);
     }


}


public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello ");

        Strings s=new Strings();
        System.out.println(sb);

        s.append(sb ,"world");
        System.out.println(sb);

        s.insert(sb,6,"beautiful ");
        System.out.println(sb);




    }
}
