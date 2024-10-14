public class Account {
    String name;
    String address;
    double balance;

    public void display(){
        System.out.println(name + " (" + address + ") имеет на счету $" + balance);
    }
}
