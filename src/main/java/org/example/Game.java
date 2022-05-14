package org.example;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets play Rock, Paper, Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("Are you ready? Type 'yes' if you are");
        String answer = scan.nextLine();
        if (answer.contains("y")) {
            System.out.println("\nrock -- paper -- scissors, shoot!");
            String userChoice = scan.nextLine();
            String computerChoice = computerChoice();  //computer result
            String results = result(userChoice, computerChoice);
            printResults(userChoice,computerChoice,results);
        } else {
            System.out.println("I guess you're scared.");
        }

    }

    public static String computerChoice() {
        double random = Math.random() * 3;
        int num = (int) random;
        switch (num) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "";
        }
    }

    public static String result(String userChoice, String computerChoice) {
        String result = "";
        if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win";
        }
        else if (computerChoice.equals("rock") && userChoice.equals("scissors")) {
            result = "You lose";
        }
        else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You Win";
        }
        else if (computerChoice.equals("paper") && userChoice.equals("rock")) {
            result = "You lose";
        }
        else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win";
        }
        else if (computerChoice.equals("scissors") && userChoice.equals("paper")) {
            result = "You lose";
        } else {
            result = "it's a tie";
        }
        return result;
    }

    public static void printResults(String userChoice, String computerChoice, String result){
        System.out.println("You chose: " + userChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);

    }
}






