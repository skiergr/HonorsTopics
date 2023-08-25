import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileEditor {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("Hello");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
