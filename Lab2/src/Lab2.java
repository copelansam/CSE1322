import java.util.Scanner;

public class Lab2 {
    static public class StockItem{
        private String description;
        private static int IDCount = 0;
        private int ID;
        private float price;
        private int quantity;
        StockItem(){
            ID = IDCount++;
        }

        StockItem(String name, float money, int amount){
            description = name;
            price = money;
            quantity = amount;
            ID = IDCount++;
        }

        String getDescription(){
            return this.description;
        }
        int getID(){
            return this.ID;
        }

        int getQuantity(){
            return this.quantity;
        }

        float getPrice(){
            return this.price;
        }

        String ToString(){
            return "item number: " + getID() + " is " + getDescription() + " has price " + getPrice() + " we currently have " + getQuantity() + " in stock";
        }

        void setPrice(float value){
            this.price = value;
            if (value < 0){
                System.out.println("Error");
            }
        }
        void lowerInventory(int amount){
            this.quantity -= amount;
            if (this.quantity < 0){
                System.out.println("Error");
            }
        }
        void increaseInventory(int amount){
            this.quantity += amount;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int selection = 0;
        float newPrice = 0f;
        int amount;
        StockItem milk = new StockItem("1 Gallon of Milk", 3.60f, 15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98f, 30);
        while (selection != 8) {
            System.out.println("1. Sold One Milk");
            System.out.println("2. Sold One Bread");
            System.out.println("3. Change price of Milk");
            System.out.println("4. Change price of Bread");
            System.out.println("5. Add Milk to Inventory");
            System.out.println("6. Add Bread to Inventory");
            System.out.println("7. See Inventory");
            System.out.println("8. Quit");
            selection = sc.nextInt();

            switch (selection) {
                case 1: milk.lowerInventory(1);
                System.out.println("");
                break;
                case 2: bread.lowerInventory(1);
                System.out.println();
                break;
                case 3: System.out.println();
                System.out.println("What is the new price for milk? ");
                newPrice = sc.nextFloat();
                milk.setPrice(newPrice);
                System.out.println();
                break;
                case 4: System.out.println();
                System.out.println("What is the new price for bread? ");
                newPrice = sc.nextFloat();
                bread.setPrice(newPrice);
                System.out.println();
                break;
                case 5: System.out.println("How many milk did we get?");
                amount = sc.nextInt();
                milk.increaseInventory(amount);
                System.out.println();
                break;
                case 6: System.out.println("How many bread did we get?");
                amount = sc.nextInt();
                bread.increaseInventory(amount);
                break;
                case 7: System.out.println();
                System.out.println(milk.ToString());
                System.out.println(bread.ToString());
                System.out.println();
                break;
            }
        }
    }
}
