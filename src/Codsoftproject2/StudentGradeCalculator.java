package Codsoftproject2;
import java.util.Scanner;
	
		public class StudentGradeCalculator
		{
		  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int n = 0;
		    int total = 0;
		    double avg = 0.0;
		    System.out.println("Enter the number of subjects:");
		    n = sc.nextInt();
		    int[] marks = new int[n];

		    for (int i = 0; i < n; i++) {
		      System.out.println("Enter the marks obtained in subject " + (i + 1) + ":");
		      marks[i] = sc.nextInt();
		    }
		    for (int i = 0; i < n; i++) {
		      total += marks[i];
		    }
		    avg = (double) total / n;
		    char grade = 'F';
		    if (avg >= 90) {
		      grade = 'A';
		    } else if (avg >= 80) {
		      grade = 'B';
		    } else if (avg >= 70) {
		      grade = 'C';
		    } else if (avg >= 60) {
		      grade = 'D';
		    } else if (avg >= 50) {
		      grade = 'E';
		    } else {
		      grade = 'F';
		    }
		    System.out.println("Total Marks: " + total);
		    System.out.println("Average Percentage: " + avg);
		    System.out.println("Grade: " + grade);
		  }
		}
		        
