package Beads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Beads {
    public static void main(String[] args) throws IOException {

        String str;
        File file = new File("src\\Beads\\Input.txt");

        //FileReader fin = new FileReader("src\\NotDeafPhone\\Input.txt");

        Scanner sc = new Scanner(file);
        str = sc.nextLine();
        int res = Integer.parseInt(str)+1;
        FileWriter countStepFinish = new FileWriter("src\\Beads\\output.txt");
        countStepFinish.write(String.valueOf(res));
        countStepFinish.close();
    }
}
