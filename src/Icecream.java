import java.util.ArrayList;

public class Icecream {
    private String name;
    private  int cost;
    private int scoops;
    private ArrayList<String> toppings=new ArrayList<>();
    public Icecream(String name,int cost,int scoops)
    {
        this.name=name;
        this.cost=cost;
        this.scoops=scoops;
    }
    public void  addtoppings(String topping)
    {
        this.toppings.add(topping);
    }

    public int getCost() {
        return cost;
    }

    public int getScoops() {
        return scoops;
    }

    public String getName() {
        return name;
    }
    public void printToppings()
    {
        for(String topping:toppings)
        {
            System.out.print(topping+" ");
        }
    }
}
