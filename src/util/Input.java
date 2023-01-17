package util;

import java.util.Objects;
import java.util.Scanner;

public class Input {
        private static Scanner scanner = new Scanner(System.in);
        public static String getString(){
            return scanner.nextLine();
        }


        public static boolean alternateMenu(String answer){
            System.out.println( "Enter: \""+answer + "\" to see available options.");
            String response = scanner.nextLine();
            return Objects.equals(response, answer);
        }

        public static boolean yesNo(){
            System.out.println(" Please enter yes or no: ( Y / N )");
            String answer = scanner.nextLine().toLowerCase();
            return Objects.equals(answer, "y") || Objects.equals(answer, "yes");
        }
        public static int getInt(int min, int max){
            int answer = 0;
            boolean isValid = false;
            System.out.println(" Please enter a number between " + min+ " and " + max);
            while (!isValid){
                String answerS = scanner.nextLine();
                if (answerS == null) {
                    System.out.println("not a valid input. Try again");
                    continue;
                }
                try {
                    int answerNum = Integer.parseInt(answerS);
                } catch (NumberFormatException nfe) {
                    System.out.println("not a valid input. Try again");
                    continue;
                }
                answer = Integer.parseInt(answerS);
                if (answer <=max && answer >= min){
                    isValid = true;
                }
                else {
                    System.out.println("not a valid input. Try again");
                }
            }
            return answer;
        }

    public static int getInt(){
        int answer = 0;
        boolean isValid = false;
        System.out.println(" Please enter a number:");
        while (!isValid){
            String answerS = scanner.nextLine();
            if (answerS == null) {
                System.out.println("not a valid input. Try again");
                continue;
            }
            try {
                int answerNum = Integer.parseInt(answerS);
            } catch (NumberFormatException nfe) {
                System.out.println("not a valid input. Try again");
                continue;
            }
            answer = Integer.parseInt(answerS);
            isValid = true;
        }
        return answer;
    }

    public double getDouble(double min, double max){
        double answer = 0;
        boolean isValid = false;
        System.out.println(" Please enter a number between " + min+ " and " + max);
        while (!isValid){
            String answerS = scanner.nextLine();
            if (answerS == null) {
                System.out.println("not a valid input. Try again");
                continue;
            }
            try {
                double answerNum = Double.parseDouble(answerS);
            } catch (NumberFormatException nfe) {
                System.out.println("not a valid input. Try again");
                continue;
            }
            answer = Double.parseDouble(answerS);
            if (answer <=max && answer >= min){
                isValid = true;
            }
            else {
                System.out.println("not a valid input. Try again");
            }
        }
        return answer;
    }

    public double getDouble(){
        double answer = 0;
        boolean isValid = false;
        System.out.println(" Please enter a number:");
        while (!isValid){
            String answerS = scanner.nextLine();
            if (answerS == null) {
                System.out.println("not a valid input. Try again");
                continue;
            }
            try {
                double answerNum = Double.parseDouble(answerS);
            } catch (NumberFormatException nfe) {
                System.out.println("not a valid input. Try again");
                continue;
            }
            answer = Double.parseDouble(answerS);
            isValid = true;
        }
        return answer;
    }

    }

