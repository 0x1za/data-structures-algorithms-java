public class Node {
    double balance;
    double withdrawLimit;
    int accountNumber;
    String accountName;

    public Node(){

    }

    public Node(double balance, double withdrawalimit, int accountNumber, String accountName){
        this.balance = balance;
        this.withdrawLimit = withdrawalimit;
        this.accountNumber = accountNumber;
        this.accountName = accountName;

    }

    @Override
    public String toString() {
        return accountName + ", Your balance is " + balance;
    }

    public double checkBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Amount is greater than balance that wont work");
        } else{
            if (amount > withdrawLimit) {
                System.out.println("You cannot withdraw amount over "+withdrawLimit);
            } else {
                balance -= amount;
            }
        }
    }

    public void transfer(Node transfer, double sendAmount) {
        if(sendAmount > balance){
            System.out.println("Only send what you have. Not what you think you have. You are broke");
        } else{
            if (sendAmount > withdrawLimit) {
                System.out.println("You cannot send over "+withdrawLimit);
            } else {
                this.balance -= sendAmount;
                transfer.balance += sendAmount;
                System.out.println(this.checkBalance());
            }
        }

    }

    public static void main(String[] args) {
        Node account1 = new Node(1000, 700, 0040, "adisa");
        Node account2 = new Node(10, 700, 0050, "mwiza");
        account1.deposit(1000000);
        System.out.println(account1.balance);
        System.out.println(account2.balance);

        account1.transfer(account2, 700);
        System.out.println(account2.balance);
    }
}
