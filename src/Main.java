import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String player;
        String computer;
        boolean playAgain = true ;
        String answer;

        Scanner sc = new Scanner(System.in);
        while (playAgain) {
            int random = (int) (Math.random() * 3);
            player = "";
            computer = "";
            answer = "";


            while (!player.equals("rock") && !player.equals("paper") && !player.equals("scissor")) {
                System.out.println("Choose ROCK or PAPER or SCISSOR ");
                player = sc.nextLine().toLowerCase();
            }

            switch (random) {
                case 0:
                    computer = "ROCK";
                    break;
                case 1:
                    computer = "PAPER";
                    break;
                case 2:
                    computer = "SCISSOR";
                    break;
            }

            System.out.println("player: " + player.toUpperCase());
            System.out.println("computer: " + computer.toUpperCase());


            switch (player) {
                case "rock":
                    if (computer.equals("ROCK")) {
                        System.out.println("It's a draw!");
                    } else if (computer.equals("PAPER")) {
                        System.out.println("You lose!");
                    } else {
                        System.out.println("You win!");
                    }
                    break;
                case "paper":
                    if (computer.equals("ROCK")) {
                        System.out.println("You win!");
                    } else if (computer.equals("PAPER")) {
                        System.out.println("Its a draw!");
                    } else {
                        System.out.println("You lose!");
                    }
                    break;
                case "scissor":
                    if (computer.equals("ROCK")) {
                        System.out.println("You lose!");
                    } else if (computer.equals("PAPER")) {
                        System.out.println("You win!");
                    } else {
                        System.out.println("Its a draw!");
                    }
                    break;
            }
            while (!answer.equals("y") && !answer.equals("n")) {
                System.out.println("Would you like to play again? (y/n)");
                answer = sc.nextLine().toLowerCase();
                if (answer.equals("y")) {
                    playAgain = true;
                } else {
                    playAgain = false;
                }
            }

        }
        System.out.println("Thank you for playing!");
    }
}