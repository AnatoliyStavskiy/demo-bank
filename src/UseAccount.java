public class UseAccount {
    public static void main(String[] args) {
        Account myAccount = new Account("Барри", "222 Inner Lane", 24.02);
        Account yourAccount = new Account("Джейн", "121 Outer Street", 55.63);

        myAccount.display();
        System.out.print(" плюс $" + myAccount.getInterest(5) + " дохода");
        System.out.println();
        yourAccount.display();
        System.out.print(" плюс $" + yourAccount.getInterest(7) + " дохода");
    }
}
