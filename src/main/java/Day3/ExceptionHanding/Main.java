package Day3.ExceptionHandling;

import java.io.File;
import java.io.IOException;
//File Processing with exeption handling
public class Main {
    public static void main(String[] args) throws IOException {
        Main ue = new Main();
        ue.openFile("D:\\VMO\\test.txt");
    }

    public File openFile(String path) throws IOException {
        File file = new File(path);

        if (!file.exists()) {
            throw new IOException(String.format("File %s doesn't exist", path));
        }
        else System.out.println("file exist");

        return file;
    }
}
