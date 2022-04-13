import java.security.PublicKey;
import java.sql.Statement;

public class Housedemo {
    public static void main(String[] args) {

        House myhouse=new House();
        myhouse.setNumStories(2);
        myhouse.setColor("white");
        myhouse.setNumWindows(22);
        House myhouse2=new House();
        myhouse2.setColor("yellow");
        myhouse2.setNumStories(3);
        myhouse2.setNumWindows(21);
        print(myhouse);
        print(myhouse2);
        System.out.println("my house has "+myhouse.getNumWindows()+"windoes"+myhouse.getNumStories()+"Stories and in "+myhouse.getColor()+"Orange");
        System.out.println("my house2 has "+myhouse2.getNumWindows()+"windoes"+myhouse2.getNumStories()+"Stories and in "+myhouse2.getColor()+"Orange");

    }
    public static void print(House house)
    {
        System.out.println("my house has "+house.getNumWindows()+"windoes"+house.getNumStories()+"Stories and in "+house.getColor()+"Orange");

    }
}
