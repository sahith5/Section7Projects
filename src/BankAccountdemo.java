public class BankAccountdemo {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("sahith",25000);
        BankAccount b2=new BankAccount("sahith2", 23000);
        System.out.println("b1 balence is "+b1.getBalence());
        System.out.println("b2 balence is "+b2.getBalence());
        b1.deposit(2000);
        System.out.println("b1 balence is "+b1.getBalence());
        b1.withdraw(23000);
        System.out.println("b1 balence is"+b1.getBalence());
        b2.withdraw(200000);
        System.out.println(b2.getBalence());

    }
}
