import java.util.ArrayList;
import java.util.List;

/*
 * Create the Account and Transaction classes here.
 */
 class Account {
    private int balance;
    
    public String deposit(int money) {
        this.balance = money;
        return "Depositing $"+money;
    }
    
    public String withdraw(int money) {
        if (this.balance < money) {
            return "Withdrawing $"+money+"(Insufficient Balance)";
        } else {
            this.balance = this.balance-money;
            return "Withdrawing $"+money;
        }
    }
    
    public int getBalance() {
        return balance;
    }
}

class Transaction {
    private Account account;
    private List<String> transactions = new ArrayList<>();
    
    public Transaction(Account account) {
       this.account = account; 
    }
    
    public void deposit(int money){
        if (account != null) {
           transactions.add(account.deposit(money)); 
        }
    }
    
    public void withdraw(int money){
        if (account != null){
            transactions.add(account.withdraw(money));
        }
    }
    
    public List<String> getTransaction() {
        return transactions;
    }
}
