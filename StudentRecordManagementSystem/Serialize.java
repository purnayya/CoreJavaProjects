package StudentRecordManagementSystem;

import java.io.*;
import java.util.*;

public class Serialize {


	    public static void serialize(List<Student> students) throws IOException {
	        try (FileOutputStream fos = new FileOutputStream("students.ser");
	             BufferedOutputStream bos = new BufferedOutputStream(fos);
	             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
	            oos.writeObject(students);
	        }
	    }
	
}