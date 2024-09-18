import java.util.Scanner;
import java.util.ArrayList;
public class Driver {
    public static void main(String[] args) {
        System.out.println("[Weather Tracking System]");
        ArrayList<WeatherEvent> running = new ArrayList<WeatherEvent>();
        char selection = ' ';
        while (selection != '5'){
            System.out.println("1. Add weather event");
            System.out.println("2. Update location");
            System.out.println("3. Update active");
            System.out.println("4. View all events");
            System.out.println("5. Quit");
            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            selection = sc.next().charAt(0);
            System.out.println();

            if (selection == '1'){
                    Scanner creationScan = new Scanner(System.in);
                    System.out.println("1. Rain");
                    System.out.println("2. Snow");
                    System.out.println("3. Fog");
                    System.out.println("4 Particle");
                    System.out.print("What type of weather event is being added? ");
                    int weatherSelect = sc.nextInt();
                    System.out.print("Where is the event happening? ");
                    String location = creationScan.nextLine();
                    switch (weatherSelect){
                        case 1:
                            System.out.print("What is the rate of fall? (in/h) ");
                            double rateOfFall = creationScan.nextDouble();
                            System.out.print("What is the diameter of the drops? (in) ");
                            double dropSize = creationScan.nextDouble();
                            WeatherEvent newRain = new Rain(dropSize, location, true, rateOfFall);
                            System.out.println("Rain event added");
                            running.add(newRain);
                            System.out.println();
                            break;

                        case 2:
                            System.out.print("What is the rate of fall? (in/h) ");
                            rateOfFall = creationScan.nextDouble();
                            System.out.print("What is the temperature? (F) ");
                            double temperature = creationScan.nextDouble();
                            WeatherEvent newSnow = new Snow(location, true, rateOfFall, temperature);
                            System.out.println("Snow event added");
                            running.add(newSnow);
                            System.out.println();
                            break;

                        case 3: System.out.print("What is the visibility? (1/8 mi) ");
                            int visibility = creationScan.nextInt();
                            System.out.print("Is the fog freezing? (y/n) ");
                            char freeze = sc.next().charAt(0);
                            boolean freezing = false;
                            if (freeze == 'y'){
                                freezing = true;
                            }
                            else if (freeze == 'n'){
                                freezing = false;
                            }
                            WeatherEvent newFog = new Fog(location, true, visibility, freezing);
                            running.add(newFog);
                            System.out.println("Fog event added");
                            System.out.println();
                            break;

                        case 4:
                            System.out.print("What is the visibility? (1/8 mi) ");
                            visibility = creationScan.nextInt();
                            creationScan.nextLine();
                            System.out.print("What is the obscuration made of? (Sand/Dust/Ash/Other) ");
                            String type = creationScan.nextLine();
                            WeatherEvent newParticle = new Particle(location, true, type, visibility);
                            System.out.println("Particle event added");
                            running.add(newParticle);
                            System.out.println();
                            break;
                    }
            }
            else if (selection == '2'){
                    System.out.print("Enter id of weather event:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    if (id >= running.size() || id < 0){
                        System.out.println("No event with that id.");
                    }
                    else {
                        System.out.print("Enter the new location of the weather event (currently “ " + running.get(id).getLocation() + "”):");
                        String newLocation = sc.nextLine();
                        running.get(id).setLocation(newLocation);
                        System.out.println("Location updated");
                    }
            }
            else if (selection == '3'){
                System.out.print("Enter id of weather event: ");
                int id = sc.nextInt();
                if (id >= running.size() || id < 0){
                    System.out.println("No event with that id.");
                }
                else {
                    if (running.get(id).getActive()) {
                        System.out.println("Event set to \"inactive\"");
                        running.get(id).setActive(false);
                    }
                    else{
                        System.out.println("Event set to \"active\"");
                        running.get(id).setActive(true);
                    }
                }
            }
            else if (selection == '4'){
                String total = "";
                for(WeatherEvent event : running){
                    total += event.toString();
                    total += "\n";
                }
                System.out.println(total);
            }
            else if (selection == '5'){
                System.out.println("Shutting off...");
            }
            else{
                System.out.println("Invalid option!");
            }

        }

    }
}
