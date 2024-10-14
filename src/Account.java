public class Account {
    String name;
    String address;
    double balance;

    public void display(){
        System.out.println(name + " (" + address + ") имеет на счету $" + balance);
    }

    public double getInterest(double percentageRate){
        return balance * percentageRate / 100;
    }

    public Account(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
    }
}
