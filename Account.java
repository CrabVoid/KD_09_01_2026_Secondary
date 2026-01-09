public class Account {
    private int balance;

    public account (int bill) {
        balance = bill;
    }
    

    public int Deposit (double dep) {
        if (dep < 0) {
            System.out.println("\nSummai jābūt pozitīvai");
        } else {
            balance += dep;
        }
        return balance;
    }
    
    public double Withdraw(double wit) {
        if (wit < 0) {
            System.out.println("\nSummai jābūt pozitīvai");
        } else if (wit > balance) {
            System.out.println("\nNepietiekami līdzekļi");
        } else {
            balance -= wit;
        }
        return balance;
    }
    

}