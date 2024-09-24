import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        ArrayList<Media> allMedia = new ArrayList<Media>();
        int selection = -1;
        System.out.println("[Media Manager]");
        while(selection != 9){
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.println("1- Add Image");
            System.out.println("2- Add Music");
            System.out.println("3- Add Video");
            System.out.println("4- Show images");
            System.out.println("5- Show music");
            System.out.println("6- Show videos");
            System.out.println("7- Show images and videos");
            System.out.println("8- Show music and videos");
            System.out.println("9- Exit");
            System.out.print("Enter option: ");
            selection = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch(selection){
                case 1:
                    System.out.print("Enter file name: ");
                    String fileName = sc.nextLine();
                    System.out.print("Enter image codec: ");
                    String imageCodec = sc.nextLine();
                    Image newImage = new Image(fileName, imageCodec);
                    allMedia.add(newImage);
                    break;
                case 2:
                    System.out.print("");
                    System.out.print("Enter file name: ");
                    fileName = sc.nextLine();
                    System.out.print("Enter audio codec: ");
                    String audioCodec = sc.nextLine();
                    Music newMusic = new Music(fileName, audioCodec);
                    allMedia.add(newMusic);
                    break;
                case 3:
                    System.out.print("Enter file name: ");
                    fileName = sc.nextLine();
                    System.out.print("Enter image codec: ");
                    imageCodec = sc.nextLine();
                    System.out.print("Enter audio codec: ");
                    audioCodec = sc.nextLine();
                    Video newVideo = new Video(fileName, audioCodec, imageCodec);
                    allMedia.add(newVideo);
                    break;
                case 4:
                    String total = "";
                    for(Media item: allMedia){
                        if (item instanceof Image){
                            total += ((Image) item).getMediaInfo() +"\n";

                        }
                    }
                    System.out.print(total);
                    break;
                case 5:
                    total = "";
                    for(Media item: allMedia){
                        if (item instanceof Music){
                            total += ((Music) item).getMediaInfo() +"\n";
                        }
                    }
                    System.out.print(total);
                    break;
                case 6:
                    total = "";

                    for (Media item: allMedia){
                        if (item instanceof Video){
                            total += ((Video) item).getMediaInfo() +"\n";
                        }
                    }
                    System.out.print(total);
                    System.out.println();
                    break;
                case 7:
                    total = "";
                    for(Media item: allMedia){
                        if (item instanceof Image){
                            total += ((Image) item).getMediaInfo() +"\n";
                        }
                        else if (item instanceof Video){
                            total += ((Video) item).getMediaInfo() +"\n";
                        }
                    }
                    System.out.print(total);
                    break;
                case 8:
                    total = "";
                    for (Media item: allMedia){
                        if (item instanceof Music){
                            total += ((Music) item).getMediaInfo() + "\n";
                        }
                        else if (item instanceof Video){
                            total += ((Video) item).getMediaInfo() + "\n";
                        }
                    }
                    System.out.print(total);
                    break;
                case 9: System.out.println("Shutting down...");
                break;
            }
        }
    }
}
