import java.util.Scanner;
public class Driver {

    public static int timeCheck(String time) throws InvalidTimeException{
        int totalTime = 0;
        String seperateTime[] = time.split(":",3);
        int timeValues[] = new int[3];
        for (int i = 0; i < 3; i++){
            int value = Integer.parseInt(seperateTime[i]);
            timeValues[i] = value;
        }
        if (timeValues[0] < 0){
            throw new InvalidTimeException("Hour cannot be a negative value");
        }
        else if (timeValues[0] > 23){
            throw new InvalidTimeException("Hour must be below 24");
        }

        if (timeValues[1] < 0){
            throw new InvalidTimeException("Minutes connot be a negative value");
        }
        else if (timeValues[1] >= 60){
            throw new InvalidTimeException("Minutes must be less than 60");
        }

        if (timeValues[2] < 0){
            throw new InvalidTimeException("Seconds cannor be a negative value");
        }
        else if (timeValues[2] >= 60){
            throw new InvalidTimeException("Seconds must be less than or equal to 60");
        }

        int totalHours = (timeValues[0] * 60 * 60);
        int totalMinutes = (timeValues[1] * 60);
        totalTime = totalMinutes + totalHours + timeValues[2];
        return totalTime;

    }


    public static void main(String [] args){
       try{
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
          String firstTime = sc.nextLine();
          int firstTimeValue = timeCheck(firstTime);
          System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
          String secondTime = sc.nextLine();
          int secondTimeValue = timeCheck(secondTime);
          int difference = Math.abs(firstTimeValue - secondTimeValue);
          System.out.println("Difference in seconds: " + difference);
       }
       catch(InvalidTimeException e){
           System.out.println(e);
       }
    }
}
