public class UseAccount {
    public static void main(String[] args) {
        Account myAccount = new Account("Барри", "222 Inner Lane", 24.02);
        Account yourAccount = new Account("Джейн", "121 Outer Street", 55.63);

        myAccount.display();
        yourAccount.display();
    }
}
