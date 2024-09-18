import java.util.ArrayList;

class Bill{
    private ArrayList<BillingItem> items;
    private static int nextId = 0;
    private int id;
    static double taxPercentage = 0;

    Bill (){
        items = new ArrayList<BillingItem>();
        id = nextId++;
    }
    public static void setTax(double tax){
        if (tax >= 0){
            taxPercentage = tax;
        }
    }

    public static double getTax(){
        return taxPercentage;
    }

    public void addItem(BillingItem item){
        items.add(item);
    }
    public void removeItem(BillingItem item){
        items.remove(item);
    }
    public BillingItem getItem(int index){
        if (index < items.size() && index >= 0) {
            return items.get(index);
        }
        return null;
    }

    public String seeItems(){
        String total = "";
        if (items.size() == 0){
            return total;
        }
        int counter = 0;
        for (BillingItem item: items){
            total += counter++ + ". " + item.getDescription() + ": $" + item.getAmount() + "\n";
        }
        return total;
    }
    public double calculateSubTotal(){
        double total = 0d;
        for (BillingItem item: items){
            total += item.getAmount();
        }
        return total;
    }
    public double calculateTotal(){
        return Math.round(calculateSubTotal() * ((taxPercentage / 100) + 1) * 100) / 100d;
    }

    @Override
    public String toString(){
        String total = "#" + this.id + "\n\n";
        for (BillingItem item : items){
            total += item.toString();
        }
        total += "\n" + "Subtotal: $" +calculateSubTotal() +"\n";
        total += "Total + Tax: $" + calculateTotal();
        return total;
    }
}