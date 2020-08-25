package bankAccount;

/** A bank account has a balance that can be changed by 3 deposits and withdrawals. 
*/
public class BankAccount{
 
    private double[] balance = new double[5];
    private String user;
    /** Constructs a bank account with a zero balance. 
    */
    public BankAccount(){
    	user = "Frank";
        balance[0] = 0;
    }
    /** Constructs a bank account with a given balance. @param initialBalance the initial balance 
    */
    public BankAccount(double initialBalance){
        balance[0] = initialBalance;
    }
   
    /** Deposits money into the bank account. @param amount the amount to deposit */
    public void deposit(double amount, String user){
    	if (this.user == user) {
    		balance[0] = balance[0] + amount;	
    	}
        
    }
    /** Withdraws money from the bank account. @param amount the amount to withdraw */
    public void withdraw(double amount, String user){
    	if (this.user == user) {
    		balance[0] = balance[0] - amount;	
    	}
    }
    
    /** Gets the current balance of the bank account. @return the current balance */
    public double getBalance(){
    	System.out.println(user);
        return balance[0];
    }
}