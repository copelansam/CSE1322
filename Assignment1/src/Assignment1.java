import java.util.Scanner;


public class Assignment1 {
 static void updateFrequencies(Symbol[] collection){
    int totalUses = 0;
    double currentFrequency = 0;
    for (int i = 0; i < 9; i++){
        totalUses += collection[i].uses;
    }
    for (int i = 0; i < 9; i++){
        currentFrequency = 0;
        currentFrequency = ((double)collection[i].uses / totalUses);
        collection[i].frequency = currentFrequency;
    }
}

 static void sortSymbols(Symbol[] sorted){
    for(int i = 0; i < sorted.length - 1; i++){
        for (int j = 0; j < sorted.length - 1 - i; j++){
            if (sorted[j].frequency < sorted[j+1].frequency){
                Symbol temp;
                temp = sorted[j+1];
                sorted[j+1] = sorted[j];
                sorted[j] = temp;
            }
            else if (sorted[j].frequency == sorted[j+1].frequency){
                if (sorted[j].symbol > sorted[j+1].symbol){
                    Symbol temp;
                    temp = sorted[j+1];
                    sorted[j+1] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
    }
}


    public static void main(String[] args){

        System.out.println("[Symbol Recommender]");
        Symbol[] symbols = new Symbol[9];
        char c1 = '\u221E';
        symbols[0] = new Symbol(c1);
        char c2 = '\u263A';
        symbols[1] =  new Symbol(c2);
        char c3 = '\u2640';
        symbols[2] = new Symbol(c3);
        char c4 = '\u2642';
        symbols[3] = new Symbol(c4);
        char c5 = '\u2660';
        symbols[4] = new Symbol(c5);
        char c6 = '\u2663';
        symbols[5] = new Symbol(c6);
        char c7 = '\u2665';
        symbols[6] = new Symbol(c7);
        char c8 = '\u2666';
        symbols[7] = new Symbol(c8);
        char c9 = '\u266B';
        symbols[8] = new Symbol(c9);

        boolean resume = true;
        while (resume){
            int selection;
            System.out.println("Here are the available symbols");
            for (int i = 0; i < symbols.length; i++){
                System.out.println((i+1) + " - " + symbols[i].symbol);
            }
            System.out.println("0 - Exit");
            System.out.print("Please select a symbol to print: ");
            Scanner sc = new Scanner(System.in);
            selection = sc.nextInt();
            System.out.println();
            if (selection == 0){
                System.out.print("Shutting off...");
                resume = false;
                break;
            }
            else if (selection < 0 || selection > 9){
                System.out.println("Invalid option!");
                System.out.println();
                continue;
            }
            selection --;
            System.out.println("You selected the " + symbols[selection].symbol + " symbol");
            System.out.println();
            symbols[selection].uses++;
            updateFrequencies(symbols);
            sortSymbols(symbols);
        }
    }
}