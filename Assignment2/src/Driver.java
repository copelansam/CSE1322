 import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        System.out.println("[Bill Generator]");
        String resume = "";
        Scanner scan = new Scanner(System.in);
        while (!resume.equals("no")) {
            Bill userBill = new Bill();
            System.out.println("New bill created.");



            char option = ' ';
            while (option != '8') {
                Scanner scanning = new Scanner(System.in);
                System.out.println();
                System.out.println("1. Add item");
                System.out.println("2. Remove item");
                System.out.println("3. Add subitem");
                System.out.println("4. Remove subitem");
                System.out.println("5. See tax");
                System.out.println("6. Set tax");
                System.out.println("7. Preview bill");
                System.out.println("8. Finish");
                System.out.println("Select option: ");
                option = scanning.nextLine().charAt(0);

                switch (option) {
                    case '1':
                        Scanner addItem = new Scanner(System.in);
                        System.out.print("Enter the item's description: ");
                        String description = addItem.nextLine();
                        System.out.print("Enter the item's amount: ");
                        double amount = addItem.nextDouble();
                        BillingItem newItem = new BillingItem(amount, description);
                        userBill.addItem(newItem);
                        System.out.println("Item added to bill.");
                        break;

                    case '2':
                        Scanner removeItem = new Scanner(System.in);
                        System.out.println(userBill.seeItems());
                        if (!userBill.seeItems().equals("")) {
                            System.out.print("Select item to remove: ");
                            int index = removeItem.nextInt();
                            if (userBill.getItem(index) != null) {
                                System.out.println("Item removed from bill.");
                                BillingItem remove = userBill.getItem(index);
                                userBill.removeItem(remove);
                            }
                            else {
                                System.out.println("Invalid item to remove! ");
                            }
                        }
                        else{
                            System.out.println("There are no items to remove!");
                        }
                        break;
                    case '3':
                        Scanner subScan = new Scanner(System.in);
                        System.out.println(userBill.seeItems());
                        System.out.print("Select an item: ");
                        int indexSubAdd = subScan.nextInt();
                        BillingItem adding = userBill.getItem(indexSubAdd);
                        Scanner scanWhy = new Scanner(System.in);
                        System.out.print("Enter subitem's description: ");
                        String subDescription = scanWhy.nextLine();
                        System.out.print("Enter subitem's amount: ");
                        double subAmount = subScan.nextDouble();
                        BillingSubItem newSub = new BillingSubItem(subAmount, subDescription);
                        adding.addSubItem(newSub);
                        System.out.println("Subitem added to item.");
                        break;
                    case '4':
                        Scanner removeSub = new Scanner(System.in);
                        System.out.println(userBill.seeItems());

                        if (!userBill.seeItems().equals("")) {
                            System.out.print("Select an item: ");
                            int indexSubRemove = removeSub.nextInt();
                            BillingItem check = userBill.getItem(indexSubRemove);
                            if (!(check.seeSubItems().equals(""))){
                                System.out.println(check.seeSubItems());
                                System.out.print("Select subitem to remove: ");
                                int subItemIndex = removeSub.nextInt();

                                if (check.getSubItem(subItemIndex) != null) {
                                    System.out.println("Subitem removed from item.");
                                    check.removeSubItem(check.getSubItem(subItemIndex));
                                } else {
                                    System.out.println("Invalid subitem to remove! ");
                                }
                            }
                            else{
                                System.out.println("That item has no subitems!");

                            }
                        }
                        else{
                            System.out.println("There are no items from which you can remove subitems!");
                        }
                        break;
                    case '5':
                        System.out.println("Current tax is " + (Bill.getTax() / 100) + "%");
                        break;
                    case '6':
                        Scanner taxScan = new Scanner(System.in);
                        System.out.print("Enter new tax %: ");
                        double newTax = taxScan.nextDouble();
                        Bill.setTax(newTax);
                        System.out.println("Tax set.");
                        break;
                    case '7':
                        System.out.println("The current contents of the bill are: ");
                        System.out.println("====================");
                        System.out.println(userBill.toString());
                        System.out.println("====================");
                        break;
                    case '8':
                        System.out.println("====================");
                        System.out.println(userBill.toString());
                        System.out.println("====================");
                        break;
                }
            }
            System.out.print("Would you like to create a new bill? (say \"no\" to terminate) ");
            resume = scan.nextLine();
        }
        System.out.println();
        System.out.println("Shutting off...");
    }
}
