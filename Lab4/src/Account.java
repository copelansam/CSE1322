 public class Account {
    static int accountCounter = 10001;
    final private int ACCOUNT_NUMBER;
    private float account_balance;

    Account(){
        setAccount_balance(0.00f);
        ACCOUNT_NUMBER = accountCounter++;
    }

    Account(float balance){
        setAccount_balance(balance);
        ACCOUNT_NUMBER = accountCounter++;
    }

    public int getAccount_number(){

        return ACCOUNT_NUMBER;
    }

    public void setAccount_balance(float balance){

        account_balance = balance;
    }
    public float getAccount_balance(){

        return account_balance;
    }
    public void withdrawal(float amount){
        account_balance -= amount;
        account_balance = Math.round(account_balance * 100f) / 100f;
    }
    public void deposit(float amount){
        account_balance += amount;
    }
}
