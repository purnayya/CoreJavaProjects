package StudentRecordManagementSystem;
import java.io.*;

public class ReadFile {

	public static void read() throws IOException {
        System.out.println("File Read:");
        try (FileReader fr = new FileReader("students.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        }
    }
}