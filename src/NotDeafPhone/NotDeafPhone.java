package NotDeafPhone;

import java.io.*;
import java.util.*;

public class NotDeafPhone {
    public static void main(String[] args) throws IOException {
        String str;
        File file = new File("src\\NotDeafPhone\\Input.txt");

        //FileReader fin = new FileReader("src\\NotDeafPhone\\Input.txt");

        Scanner sc = new Scanner(file);
        str = sc.nextLine();
        FileWriter countStepFinish = new FileWriter("src\\NotDeafPhone\\output.txt");
        countStepFinish.write(str);
        countStepFinish.close();
    }
}
