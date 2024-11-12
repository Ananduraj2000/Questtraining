package com.quest.practice.vars;

import java.util.Scanner;

public class StudentGrading {

    //final keyword for making score,subject count and subject const
    private static final int MAX_SCORE = 100;
    private static final int MIN_SCORE = 0;
    private static final int SUBJECT_COUNT = 3;
    private static final String[] SUBJECTS = {"Math", "Science", "English"};

    public static char calculateGrade(double average) {
        if (average >= 90)
            return 'A';
        else if (average >= 80)
            return 'B';
        else if (average >= 70)
            return 'C';
        else if (average >= 60)
            return 'D';
        else
            return 'F';
    }

    public static String generateFeedback(char grade, boolean needsImprovement) {

        switch (grade) {
            case 'A':
                return "Excellent perfomance";
            case 'B':
                return "Good job";
            case 'C':
                return "You can do better";
            case 'D':
                return "Needs Improvement";
            default:
                return "Failure.You need significant improvement  " +
                        (needsImprovement ? "Warning!needs improvement in individual subject":"");


        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            scanner.nextLine();

            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            int totalScore = 0;
            boolean needsImprovement = false;

            for (String subject : SUBJECTS) {

                int score;
                while (true) {
                    System.out.print("Enter score for " + subject + " (0-100): ");
                    score = scanner.nextInt();
                    if (score >= MIN_SCORE && score <= MAX_SCORE) break;
                    System.out.println("Invalid score! Please enter a score between 0 and 100.");
                }

                totalScore += score;
                if (score < 60) needsImprovement = true;
            }

            double averageScore = totalScore / (double) SUBJECT_COUNT;
            char grade = calculateGrade(averageScore);
            String feedback = generateFeedback(grade, needsImprovement);


            System.out.println("\nHere is the result for  " + name + ":");
            System.out.println("Total Score:   " + totalScore);
            System.out.println("Average Score:   " + averageScore);
            System.out.println("Grade:  " + grade);
            System.out.println("Feedback:  " + feedback);
            System.out.println();

        }
    }


}


