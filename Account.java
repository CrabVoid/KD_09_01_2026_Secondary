public class Account {
    private double balance;


    public Account (double bill) {
        balance = bill;
    }
    

    public double Deposit (double dep) {
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
    
    public double Display() {
        System.out.println(balance);
        return balance; 
    }

}