class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance = 0.0;

    //                  ==========     CONSTRUCTOR LOGIC ===================

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
 //                      ============     DEPOSIT LOGIC =======================

    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount...");
        } else {
            this.balance += amount;
        }
    }

 //                      ============     WITDRAW LOGIC =======================
 
    void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("You have Withdrawn: " + amount);
        }
    }

 //                      ============     CURRENT BALANCE LOGIC =======================

    double getBalance() {
        System.out.print("Your Current Balance is...");

        return this.balance;
    }

 //                      ============     DISPLAY INFORMATION LOGIC =======================

    void printStatement() {
        System.out.println("Account Number: " + accountNumber + "\n" +
                "Account Holder: " + accountHolder + "\n" +
                "Current Balance: " + this.balance);
    }

public static void main(String[] args) {
    BankAccount inp = new BankAccount("12345", "Zafran Khan", 3500);

    inp.printStatement(); // Initial statement

    inp.deposit(500);
    inp.printStatement();

    inp.withdraw(400);
    inp.printStatement();

    inp.deposit(2000);
    inp.printStatement();

    inp.withdraw(1000);
    inp.printStatement();
}
}