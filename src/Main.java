
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main (String[] args) throws IOException {

        //System.out.println("Hello!!!");

        File file = new File("file.txt");
        int length = (int) file.length();

        try {
            FileInputStream stream = new FileInputStream("file.txt");
            InputStreamReader reader = new InputStreamReader(stream);

            char[] data = new char[length];
            int readBytes = reader.read(data, 0, length);

            if (readBytes != length) {
                throw new IOException("File reading error.");
            }

            String text = new String(data);
            System.out.println(text);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}