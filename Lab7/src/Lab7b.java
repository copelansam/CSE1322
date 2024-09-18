import  java.util.Scanner;
public class Lab7b {

    public static String repeatNTimes(String message, int times){
        if (times == 0){
            return "";
        }
        else{
            return message + "\n" + repeatNTimes(message, times - 1);
        }
    }

    public static boolean isReverse(String first, String second){
        if (first.isEmpty() && second.isEmpty()){
            return true;
        }

        if (first.length() != second.length()){
            return false;
        }

        if (first.charAt(0) != second.charAt(second.length() - 1)){
            return false;
        }

        return isReverse(first.substring(1), second.substring(0,second.length() -1));

    }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter message to repeat:");
        String message = sc.nextLine();
        System.out.print("How many times? ");
        int times = sc.nextInt();
        System.out.print(repeatNTimes(message,times) + "\n");
        sc.nextLine();
        System.out.println("Enter the first string");
        String first = sc.nextLine();
        System.out.println("Enter the second string");
        String second = sc.nextLine();

        if (isReverse(first, second)){
            System.out.println(first + " is the reverse of " + second);
        }
        else if (!isReverse(first,second)){
            System.out.println(first + " is not the reverse of " + second);
        }
    }
}
