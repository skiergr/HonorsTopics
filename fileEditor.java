import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileEditor {
    public static void main(String[] args) {
        fileWriter();
        fileReader();
    }

    public static void fileWriter() {
        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("Hello");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileReader() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
