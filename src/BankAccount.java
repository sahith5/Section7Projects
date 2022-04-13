public class BankAccount {
    private String owner;
    private int balence;
    public BankAccount(String name)
    {
        this.owner=name;
    }
    public BankAccount(String name,int balence)
    {
        this.balence=balence;
        this.owner=name;
    }

    public int getBalence() {
        return balence;
    }

    public String getOwner() {
        return owner;
    }
    public void withdraw(int ammount)
    {
        if(ammount<=balence)
        {
            balence=balence-ammount;
        }
        else
        {
            System.out.println("no enougn balence");
        }
    }
    public void deposit(int ammount)
    {
        balence=balence+ammount;
    }
}

