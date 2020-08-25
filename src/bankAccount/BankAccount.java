package bankAccount;

/** A bank account has a balance that can be changed by 3 deposits and withdrawals. 
*/
public class BankAccount{
    private String[] account = {"Frank"};
    private double balance;
    /** Constructs a bank account with a zero balance. 
    */
    public BankAccount(){
        balance = 0;
    }
    /** Constructs a bank account with a given balance. @param initialBalance the initial balance 
    */
    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
   
    /** Deposits money into the bank account. @param amount the amount to deposit */
    public void deposit(double amount, String user){
    	account[0] = user;
        balance = balance + amount;
        
    }
    /** Withdraws money from the bank account. @param amount the amount to withdraw */
    public void withdraw(double amount){
        balance = balance - amount;
    }
    
    /** Gets the current balance of the bank account. @return the current balance */
    public double getBalance(){
    	System.out.println(account[0]);
        return balance;
    }
}