import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        try {
            String line = "";
            ArrayList<String> firstFile = new ArrayList<String>();
            ArrayList<String> secondFile = new ArrayList<String>();
            File file1 = new File("src/text1.txt");
            File file2 = new File("src/text2.txt");
            Scanner firstScan = new Scanner(file1);
            Scanner secondScan = new Scanner(file2);
            while (firstScan.hasNextLine()) {
                line = firstScan.nextLine();
                firstFile.add(line);
            }
            while (secondScan.hasNextLine()) {
                line = secondScan.nextLine();
                secondFile.add(line);
            }
            String total = "";
            if (firstFile.size() == secondFile.size()) {
                for (int i = 0; i < firstFile.size(); i++) {
                    String first = firstFile.get(i);
                    String second = secondFile.get(i);
                    if (!first.equals(second)) {
                        total += "Line " + (i + 1) + "\n>" + first +
                                "\n<" + second + "\n";
                    }
                }
                System.out.print(total);
            } else {
                System.out.println("Files have different number of lines.");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}