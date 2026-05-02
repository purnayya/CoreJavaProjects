package StudentRecordManagementSystem;
import java.io.*;

public class Writefile {

	    public static void write() throws IOException {
	        File file = new File("students.txt");
	        try (FileWriter fw = new FileWriter(file);
	             BufferedWriter bw = new BufferedWriter(fw)) {
	            bw.write("101,John,85.5"); bw.newLine();
	            bw.write("102,Ravi,90.0"); bw.newLine();
	            bw.write("103,Anu,88.0");  bw.newLine();
	        }
	    }
	
}