import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileEditor {
    public static void main(String[] args) {
        fileWriter("Hello", "file.txt");
        System.out.println(fileReader("file.txt"));
    }

    public static void fileWriter(String str, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String fileReader(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder str = new StringBuilder();
            while (reader.ready()) {
                str.append((char) reader.read());
            }
            reader.close();
            return str.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static int countCharacters (String fileName) throws IOException
    {
        BufferedReader reader = new BufferedReader (new FileReader (fileName));
        int charCount = 0;
        while (reader.ready())
        {
            charCount++;
        }
        return charCount;

    }



}
