public class icecreamDemo {
    public static void main(String[] args) {
        Icecream i1=new Icecream("chocolate",30,2);
        Icecream i2=new Icecream("vanila",40,3);
        System.out.println("name of icecream"+i1.getName());
        System.out.println("no. of scoops"+i1.getScoops());
        System.out.println("cost is"+i1.getCost());
        i1.addtoppings("chocochips");
        i1.addtoppings("whitechocolate");
        System.out.print("toppings are ");
        i1.printToppings();
    }
}
