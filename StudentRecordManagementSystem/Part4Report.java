package StudentRecordManagementSystem;
import java.io.*;

public class Part4Report {

	    public static void writeReport() throws IOException {
	        try (java.io.PrintWriter pw = new java.io.PrintWriter(new FileWriter("output.txt"))) {
	            pw.println("STUDENT REPORT");
	            pw.println("--------------");
	            pw.printf("%-5s %-15s %-10s%n", "ID", "Name", "Marks");
	            pw.println("--------------");
	            pw.printf("%-5s %-15s %-10s%n", "101", "John", "85.5");
	            pw.printf("%-5s %-15s %-10s%n", "102", "Ravi", "90.0");
	            pw.printf("%-5s %-15s %-10s%n", "103", "Anu",  "88.0");
	            pw.println("--------------");
	        }
	    }
	
}