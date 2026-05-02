package StudentRecordManagementSystem;

import java.io.*;
import java.util.*;

public class Main {

	    private static Object sc;

		public static void main(String[] args) throws Exception {

	        // PART 2: Write students.txt
	        Writefile.write();

	        // PART 3: Read & Print students.txt
	        ReadFile.read();

	        // PART 4: Write output.txt using PrintWriter
	        Part4Report.writeReport();

	        // PART 5: Serialize Student objects
	        List<Student> students = new ArrayList<>();
	        students.add(new Student(101, "John", 85.5, "pass101"));
	        students.add(new Student(102, "Ravi", 90.0, "pass102"));
	        students.add(new Student(103, "Anu",  88.0, "pass103"));
	        Serialize.serialize(students);

	        // PART 6: Deserialize & Print
	        Deserialize.deserialize();
	       

	    }
	}