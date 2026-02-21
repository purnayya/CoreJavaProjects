package com.purna;

import java.util.Scanner;

public class StudentGradingSys {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter numbers of Students: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] names = new String[n];
		int[] totalMarks = new int[n];
		double[] percentages = new double[n];
		char[] grades = new char[n];

		inputStudentData(scanner, names, totalMarks, percentages, grades);

		int topperIndex = findTopper(percentages);

		double classAverage = calculateClassAverage(percentages);

		displayResults(names, totalMarks, percentages, grades, topperIndex, classAverage);
		scanner.close();
	}

	private static void inputStudentData(Scanner scanner, String[] names, int[] totalMarks, double[] percentages,
			char[] grades) {
		for (int i = 0; i < names.length; i++) {
			System.out.println("\n--- Student" + (i + 1));
			System.out.print("Name:");
			names[i] = scanner.nextLine();
			System.out.print("Enter marks in 3 subjects:");
			int m1 = scanner.nextInt();
			int m2 = scanner.nextInt();
			int m3 = scanner.nextInt();
			scanner.nextLine();
			totalMarks[i] = m1 + m2 + m3;
			percentages[i] = (totalMarks[i] / 3.0);
			grades[i] = calculateGrade(percentages[i]);
		}
	}

	private static char calculateGrade(double percentage) {
		if (percentage >= 90) {
			return 'A';
		} else {
			if (percentage >= 80) {
				return 'B';
			} else {
				if (percentage >= 70) {
					return 'C';
				} else {
					if (percentage >= 60) {
						return 'D';
					} else {
						return 'E';
					}

				}
			}
		}
	}

	private static int findTopper(double[] percentages) {
		int topperIndex = 0;
		for (int i = 1; i < percentages.length; i++) {
			if (percentages[i] > percentages[topperIndex]) {
				topperIndex = i;
			} else {

			}
		}
		return topperIndex;
	}

	private static double calculateClassAverage(double[] percentages) {
		double sum = 0;
		for (double percentage : percentages) {
			sum += percentage;
		}
		return sum / percentages.length;
	}

	private static void displayResults(String[] names, int[] totalMarks, double[] percentages, char[] grades,
			int topperIndex, double classAverage) {

		System.out.println("\n==============================");
		System.out.println("      CLASS REPORT");
		System.out.println("==============================");

		System.out.println("Name\tTotal\tPercentage\tGrade");
		System.out.println("--------------------------------------");

		for (int i = 0; i < names.length; i++) {

			if (i == topperIndex) {
				System.out.println(
						names[i] + "\t" + totalMarks[i] + "\t" + percentages[i] + "\t\t" + grades[i] + "  <-- Topper");
			} else {
				System.out.println(names[i] + "\t" + totalMarks[i] + "\t" + percentages[i] + "\t\t" + grades[i]);
			}
		}

		System.out.println("--------------------------------------");
		System.out.println("Class Average = " + classAverage + "%");
		System.out.println("Topper = " + names[topperIndex] + " (" + percentages[topperIndex] + "%)");
		System.out.println("==============================");
	}

}