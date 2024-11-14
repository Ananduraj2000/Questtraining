package com.quest.practice.vars;

public class StudentScores {


    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};
        int[] ages = {20, 21, 22, 23, 24, 25, 26};
        int[][] scores = {
                {85, 90, 78, 92, -1},
                {88, 92, 80, -1, 85},
                {75, 80, 70, 60, 72},
                {90, 85, 88, 95, 92},
                {65, 70, 60, 68, 67},
                {80, 85, -1, 90, 95},
                {90, 88, 92, 85, 80}
        };

        System.out.println("To find Average score");
        calculateAverageScores(names, ages, scores);

        System.out.println("-------------------------------------------------");
        System.out.println("To find the highest Scorer");
        findHighestScorer(names, ages, scores);

        // Step 4: Ranking students by average score
        rankStudents(names, ages, scores);

        // Step 5: Detect missing data
        detectMissingData(names, scores);
    }

    // Method to calculate and print average scores
    public static void calculateAverageScores(String[] names, int[] ages, int[][] scores) {
        System.out.println("Average Scores:");
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int count = 0;
            for (int score : scores[i]) {
                if (score != -1) {
                    sum += score;
                    count++;
                }
            }
            double average;
            if (count > 0) {
                average = (double) sum / count;
            } else {
                average = 0;
            }
            System.out.println("Average score of " + names[i] + " of age " + ages[i] + " is " + average);
        }
    }

    // Method to find the student with the highest average score
    public static void findHighestScorer(String[] names, int[] ages, int[][] scores) {
        double highestAverage = 0;
        int highestIndex = -1;

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int count = 0;
            for (int score : scores[i]) {
                if (score != -1) {
                    sum += score;
                    count++;
                }
            }
            double average;
            if (count > 0) {
                average = (double) sum / count;
            } else {
                average = 0;
            }

            if (average > highestAverage) {
                highestAverage = average;
                highestIndex = i;
            }
        }

        if (highestIndex != -1) {
            System.out.printf("Highest Scorer is " + names[highestIndex] + " of age " + ages[highestIndex] +
                    " has an average score of " + highestAverage);
            System.out.println();
            System.out.println("-------------------------------------------------");
        }
    }

    // Method to rank students based on average score
    public static void rankStudents(String[] names, int[] ages, int[][] scores) {
        int[] sum=new int[names.length];
        int[] avg=new int[names.length];

        for(int i=0; i<names.length; i++){
            for(int j=0; j<scores[i].length; j++) {
                sum[i] += scores[i][j];
            }
            avg[i]=sum[i]/scores[i].length;

        }
        for (int i = 0; i < avg.length ; i++) {
            for (int j =i+1; j < avg.length ; j++) {
                if (avg[i] < avg[j]) {

                    int temp = avg[i];
                    avg[i] = avg[j];
                    avg[j] = temp;

                    String name=names[i];
                    names[i]=names[j];
                    names[j]=name;
                }
            }

        }
        System.out.println("Student ranking");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - Average Score: " + avg[i]);
        }
    }

    // Method to detect missing data in the scores array
    public static void detectMissingData(String[] names, int[][] scores) {
        System.out.println();
        System.out.println("Missing Scores:");
        for (int i = 0; i < scores.length; i++) {
            boolean hasMissing = false;
            System.out.println(names[i] + ":");
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] == -1) {
                    System.out.println("Subject " + (j + 1) + " ");
                    hasMissing = true;
                }
            }
            if (!hasMissing) {
                System.out.println("No missing score");
            }
        }
    }
}
