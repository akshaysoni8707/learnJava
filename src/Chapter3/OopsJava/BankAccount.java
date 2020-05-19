package Chapter3.OopsJava;

class Account {
    int accNo;
    String name;
    float amount;

    void setAccount(int accNo, String name, float amount) {
        this.accNo = accNo;
        this.name = name;
        this.amount = amount;
    }

    void deposit(int amt) {
//        this.amount = this.amount + amt;
        this.amount += amt;
    }

    void withdraw(int amt) {
        if (this.amount >= amt) {
            this.amount -= amt;
        } else {
            System.out.println("You don't have enough balance");
        }
    }

    void checkBalance() {
        System.out.println("Your Balance is " + this.amount);
    }

    void display() {
        System.out.println("Account Number : " + this.accNo + " Account Name : " + this.name + " Account Balance : " + this.amount);
    }
}


public class BankAccount {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAccount(123, "Akshay", 1000);
        ac.display();
        ac.deposit(2000);
        ac.checkBalance();
        ac.withdraw(3500);
        ac.checkBalance();
    }
}
