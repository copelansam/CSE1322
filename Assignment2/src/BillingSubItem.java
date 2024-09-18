class BillingSubItem{
    private double amount;
    private String description;

    BillingSubItem(double amount, String description){
        setAmount(amount);
        setDescription(description);
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    @Override
    public String toString(){
        return getDescription() + ": $" + getAmount() + "\n";
    }
}