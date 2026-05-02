 package StudentRecordManagementSystem;

import java.io.*;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    String name;
    double marks;
    transient String password;

    public Student(int id, String name, double marks, String password) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + ", password=" + password + "}";
    }
}