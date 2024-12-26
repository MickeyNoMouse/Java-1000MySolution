package AplusB;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Summ {
    public static void main(String[] args) throws IOException {

        File file = new File("src\\AplusB\\Input.txt");

        Scanner sc = new Scanner(file);

        String str = sc.nextLine();

        String[] parts = str.split(" ");
        int sum = 0;
        for (String part:parts) {
            sum += Integer.parseInt(part);
        }


        System.out.println(sum);
        FileWriter countStepFinish = new FileWriter("src\\AplusB\\output.txt");
        countStepFinish.write(String.valueOf(sum));
        countStepFinish.close();

    }
}