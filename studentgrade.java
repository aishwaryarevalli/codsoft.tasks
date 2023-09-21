import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int[] marks = new int[numSubjects];
        int totalMarks = 0;
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i+1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        double averagePercentage = (double) totalMarks / numSubjects;
        
        char grade;
        if (averagePercentage >= 89) {
            grade = 'A';
        } else if (averagePercentage >= 74) {
            grade = 'B';
        } else if (averagePercentage >= 59) {
            grade = 'C';
        } else if (averagePercentage >= 36) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}