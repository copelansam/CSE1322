public class Checkings extends Account {
    Checkings(float amount){
        super(amount);
    }
    Checkings(){
        super();
    }

    @Override
    public void withdrawal(float amount){
        if ((super.getAccount_balance() - amount) < 0){
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            super.withdrawal(20f);
        }
        super.withdrawal(amount);
    }
}
