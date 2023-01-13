import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class writeToFile {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        File writeFile = new File("file.txt");

        System.out.println("Please enter name: ");
        String name = keyboard.nextLine();
        System.out.println("please enter age: ");
        String age = keyboard.nextLine();
        System.out.println("WHat is your favourite tv program: ");
        String tv = keyboard.nextLine();


        if (!writeFile.exists()) {
            writeFile.createNewFile();
        }

        FileWriter fw = new FileWriter(writeFile.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter (fw);

        bw.write(name + " " + age);
        bw.newLine();
        bw.write("Likes Watching " + tv);

        bw.close();

    }
}
