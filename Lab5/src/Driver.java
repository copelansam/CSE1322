import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        Item[] myCollection = new Item[5];


        for (int i = 0; i < 5; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter B for Book or P for Periodical");
            char selection = sc.next().charAt(0);
            if(selection == 'B'){
                Scanner bookScan = new Scanner(System.in);
                System.out.println("Please enter the name of the Book");
                String title = bookScan.nextLine();
                System.out.println("Please enter the author of the Book");
                String author = bookScan.nextLine();
                System.out.println("Please enter the ISBN of the Book");
                int isbn = bookScan.nextInt();
                myCollection[i] = new Book (title, isbn, author);
            }
            else if(selection =='P'){
                Scanner periodicalScan = new Scanner(System.in);
                System.out.println("Please enter the name of Periodical");
                String title = periodicalScan.nextLine();
                System.out.println("Please enter the issue number");
                int number = periodicalScan.nextInt();
                myCollection[i] = new Periodical(number, title);
            }
        }
        System.out.println("Your Items:");
        for (int i = 0; i < 5; i++){
            System.out.println(myCollection[i].getListing());
            System.out.println();
        }
    }
}
