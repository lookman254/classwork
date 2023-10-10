package classwork;
import java.util.Scanner;

public class jsk {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String[] studentNames = new String[4];
	        int[] ROLL = new int[4];
	        int[] MARK1Marks = new int[4];
	        int[] MARK2Marks = new int[4];
	        int[] MARK3Marks = new int[4];
	        int[] totals = new int[4];
	        char[] RESULT = new char[4];
	        double[] averages = new double[4];
	        String[] grades = new String[4];

	        for (int i = 0; i < 4; i++) {
	            System.out.println("Enter details for Student " + (i + 1));

	            System.out.print("Enter your name: ");
	            studentNames[i] = scanner.nextLine();

	            System.out.print("Enter students Roll number: ");
	            ROLL[i] = scanner.nextInt();

	            System.out.print("Enter your marks for MARK 1: ");
	            MARK1Marks[i] = scanner.nextInt();

	            System.out.print("Enter your marks for MARK 2: ");
	            MARK2Marks[i] = scanner.nextInt();

	            System.out.print("Enter your marks for MARK 3: ");
	            MARK3Marks[i] = scanner.nextInt();

	            scanner.nextLine();

	            totals[i] = MARK1Marks[i] + MARK2Marks[i] + MARK3Marks[i];
	            averages[i] = (double) totals[i] / 3;

	            if (MARK1Marks[i] < 50 || MARK2Marks[i] < 50 || MARK3Marks[i] < 50) {
	                RESULT[i] = 'F';
	            } else {
	                RESULT[i] = 'P';
	            }

	            if (averages[i] >= 70 && averages[i] <= 100) {
	                grades[i] = "A";
	            } else if (averages[i] >= 50 && averages[i] < 70) {
	                grades[i] = "B";
	            } else if (averages[i] >= 0 && averages[i] < 50) {
	                grades[i] = "C";
	            } else {
	                grades[i] = "INVALID";
	            }
	        }

	        System.out.println("**************************");
	        System.out.println("\t \t \t\tSTUDENT MARKLIST");
	        System.out.println("**************************");
	        System.out.printf("ROLL:\tSTUDENT NAME:\tMARK1:\tMARK2:\tMARK3:\tTOTAL:\tRESULT:\tAVERAGE\tGRADE%n");

	        for (int i = 0; i < 4; i++) {
	            System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%c\t%.2f\t%s%n",
	                    ROLL[i], studentNames[i], MARK1Marks[i], MARK2Marks[i], MARK3Marks[i], totals[i], RESULT[i], averages[i], grades[i]);
	        }

	        scanner.close();
	    }
	}