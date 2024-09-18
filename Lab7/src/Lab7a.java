import java.util.Scanner;

public class Lab7a {
    public static int recursive_multiply(int a, int b){
        if ( b == 0){
            return 0;
        }
        else if (b == 1){
            return a;
        }
        else{
            return recursive_multiply(a,(b-1)) + a;
        }
    }

    public static int recursive_div(int a, int b){
        if (b == 0){
            return -1;
        }
        else if (a == b){
            return 1;
        }
        else if (b > a){
            return 0;
        }
        else{
            return 1 + recursive_div((a-b), b);
        }
    }

    public static int recursive_mod(int a, int b){
        if (b == 0){
            return -1;
        }
        else if (b > a){
            return a;
        }
        else{
            return recursive_mod((a-b), b);
        }
    }


    public static void main (String[] args){
        int selection = -1;
        while(selection != 0) {
            System.out.println("Choose from the following:");
            System.out.println("0. Quit");
            System.out.println("1. Multiply 2 numbers");
            System.out.println("2. Div 2 numbers");
            System.out.println("3. Mod 2 numbers");
            Scanner sc = new Scanner(System.in);
            selection = sc.nextInt();
            switch (selection){
                case 1:
                    System.out.print("Enter first number: ");
                    int first = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int second = sc.nextInt();
                    System.out.println("Answer: " + recursive_multiply(first,second));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    first = sc.nextInt();
                    System.out.print("Enter second number: ");
                    second = sc.nextInt();
                    System.out.println("Answer: " + recursive_div(first,second));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    first = sc.nextInt();
                    System.out.print("Enter second number: ");
                    second = sc.nextInt();
                    System.out.println("Answer: " + recursive_mod(first,second));
                    break;
            }
        }
    }
}
