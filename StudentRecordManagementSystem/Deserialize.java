package StudentRecordManagementSystem;

import java.io.*;
import java.util.*;


public class Deserialize {
	    public static void deserialize() throws IOException, ClassNotFoundException {
	        System.out.println("Deserialization Output:");
	        try (FileInputStream fis = new FileInputStream("students.ser");
	             BufferedInputStream bis = new BufferedInputStream(fis);
	             ObjectInputStream ois = new ObjectInputStream(bis)) {
	            @SuppressWarnings("unchecked")
	            List<Student> des = (List<Student>) ois.readObject();
	            for (Student s : des) System.out.println(s);
	        }
	    }
	
}