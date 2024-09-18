public class Savings extends Account {
    int deposits = 0;
    Savings(){
        super();
    }

    Savings(float amount){
        super(amount);
    }

    @Override
    public void withdrawal(float amount){
        if ((super.getAccount_balance() - amount) < 500f){
            System.out.println("Charging a fee of $10 because you are below $500");
            super.withdrawal(10.00f);
        }
        super.withdrawal(amount);
    }

    @Override
    public void deposit(float amount){
        deposits++;
        System.out.println("This is deposit number " + deposits + " to this account");
        super.deposit(amount);
        if (deposits > 5){
            System.out.println("Charging a fee of $10");
            super.withdrawal(10f);
        }
    }

    public void calcInterest(){
        final float INTERESTRATE = 0.015f;
        float interestEarned = (super.getAccount_balance() * INTERESTRATE);
        super.deposit(interestEarned);
        System.out.println("Customer earned " + interestEarned + " in interest");

    }
}
