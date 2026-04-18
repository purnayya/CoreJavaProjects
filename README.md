# Student Grading System (Java)

## 📌 Overview

The **Student Grading System** is a simple Java console application that allows users to input student details, calculate their total marks, percentage, assign grades, and generate a class report.

It also identifies the class topper and calculates the overall class average.

---

## 🚀 Features

* Input multiple student records
* Accept marks for 3 subjects:

  * Mathematics
  * Chemistry
  * Physics
* Calculate:

  * Total marks
  * Percentage
* Assign grades based on percentage:

  * A (90 and above)
  * B (80–89)
  * C (70–79)
  * D (60–69)
  * E (below 60)
* Identify the topper
* Compute class average
* Display a formatted class report

---

## 🛠️ Technologies Used

* Java
* Scanner class (for user input)

---

## 📂 Program Structure

The program consists of the following methods:

* `main()`
  Controls program flow and initializes arrays.

* `inputStudentData()`
  Takes input for student names and marks, calculates totals, percentages, and grades.

* `calculateGrade(double percentage)`
  Returns grade based on percentage.

* `findTopper(double[] percentages)`
  Finds the index of the student with the highest percentage.

* `calculateClassAverage(double[] percentages)`
  Computes the average percentage of the class.

* `displayResults(...)`
  Displays all student results, topper, and class average.

---

## ▶️ How to Run

1. Save the file as:

   ```
   StudentGradingSystem.java
   ```

2. Compile the program:

   ```
   javac StudentGradingSystem.java
   ```

3. Run the program:

   ```
   java StudentGradingSystem
   ```

---

## 📊 Sample Output

```
Enter numbers of Students: 2

--- Student 1
Name: John
Enter marks in 3 subjects
Mathematics: 90
Chemistry: 85
Physics: 80

--- Student 2
Name: Alice
Mathematics: 95
Chemistry: 92
Physics: 88

==============================
      CLASS REPORT
==============================
Name    Total   Percentage  Grade
--------------------------------------
John    255     85.0        B
Alice   275     91.6        A  <-- Topper
--------------------------------------
Class Average = 88.3%
Topper = Alice (91.6%)
==============================
```

---

## ⚠️ Notes

* Ensure valid numeric input for marks.
* Percentages are calculated as the average of 3 subjects.
* The program uses arrays, so the number of students must be known at runtime.

---

## 📈 Possible Improvements

* Add input validation
* Support more subjects
* Store data using objects (OOP approach)
* Export results to a file
* Add GUI (using Swing/JavaFX)

---

## 👨‍💻 Author

Your Name
venkata purnachandra rao
---

