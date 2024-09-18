import java.util.ArrayList;
class BillingItem {
    private ArrayList<BillingSubItem> subitems;
    private double amount;
    private String description;

    BillingItem() {
        amount = 0d;
        description = "";
        subitems = new ArrayList<BillingSubItem>();
    }

    BillingItem(double amount) {
        setAmount(amount);
        description = "";
        subitems = new ArrayList<BillingSubItem>();
    }

    BillingItem(double amount, String description) {
        setAmount(amount);
        setDescription(description);
        subitems = new ArrayList<BillingSubItem>();
    }

    public double getAmount() {
        if (subitems.size() == 0) {
            return amount;
        }
        double total = 0;
        for (BillingSubItem subitem : subitems) {
            total += subitem.getAmount();
        }
        return total;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addSubItem(BillingSubItem subItem) {
        subitems.add(subItem);
    }

    public void removeSubItem(BillingSubItem subItem) {
        subitems.remove(subItem);
    }

    public BillingSubItem getSubItem(int index) {
        if (index < subitems.size() && index >= 0) {
            return subitems.get(index);
        }
        return null;
    }

    public String seeSubItems() {
        int index = 0;
        String total = "";
        if (subitems.size() == 0) {
            return total;
        }
        for (BillingSubItem subItem : subitems) {
            total += index++ + ". " + subItem.toString();

        }
        return total;
    }

    @Override
    public String toString() {
        String total = "";
        if (subitems.size() == 0) {
            total += getDescription() + ": $" + getAmount() + "\n";
        } else {
            total += getDescription() + "\n";
            if (subitems.size() > 0) {
                for (BillingSubItem subItem : subitems) {
                    total += "\t" + subItem.toString();
                }
            }

        }
        return total;
    }
}
