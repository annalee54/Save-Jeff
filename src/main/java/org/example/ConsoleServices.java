package org.example;

import org.springframework.beans.factory.NoUniqueBeanDefinitionException;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.*;

public class ConsoleServices {
    private static int count = 0;
    private final Scanner userInput = new Scanner(System.in);

    public ConsoleServices() {
    }

    public void hangmanImage(int count, boolean didHaveLetter) {
        if (count == 0) {
            System.out.println();
            System.out.println("      ______");
            System.out.println("      |/   |");
            System.out.println("      |     ");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("  ____|_________");
            System.out.println(" /             /|");
            System.out.println("/_____________/ |");
            System.out.println("|             | /");
            System.out.println("|_____________|/");
            System.out.println();
        }
        if (count == 1) {
            if (!didHaveLetter) {
                System.out.println();
                System.out.println("Wrong guess, try again!");
            }
            System.out.println();
            System.out.println("      ______");
            System.out.println("      |/   |");
            System.out.println("      |    @");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("  ____|_________");
            System.out.println(" /             /|");
            System.out.println("/_____________/ |");
            System.out.println("|             | /");
            System.out.println("|_____________|/");
            System.out.println();
        }

        if (count == 2) {
            if (!didHaveLetter) {
                System.out.println();
                System.out.println("Wrong guess, try again!");
            }
            System.out.println();
            System.out.println("      ______");
            System.out.println("      |/   |");
            System.out.println("      |    @");
            System.out.println("      |    |");
            System.out.println("      |    |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("  ____|_________");
            System.out.println(" /             /|");
            System.out.println("/_____________/ |");
            System.out.println("|             | /");
            System.out.println("|_____________|/");
            System.out.println();
        }

        if (count == 3) {
            if (!didHaveLetter) {
                System.out.println();
                System.out.println("Wrong guess, try again! You're kind of making me nervous...");
            }
            System.out.println();
            System.out.println("      ______");
            System.out.println("      |/   |");
            System.out.println("      |    @");
            System.out.println("      |   \\|");
            System.out.println("      |    |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("  ____|_________");
            System.out.println(" /             /|");
            System.out.println("/_____________/ |");
            System.out.println("|             | /");
            System.out.println("|_____________|/");
            System.out.println();
        }

        if (count == 4) {
            if (!didHaveLetter) {
                System.out.println();
                System.out.println("Wrong again! Omg!! You're not really gonna let Jeff die, right??!!");
            }
            System.out.println();
            System.out.println("      ______");
            System.out.println("      |/   |");
            System.out.println("      |    @");
            System.out.println("      |   \\|/");
            System.out.println("      |    |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("  ____|_________");
            System.out.println(" /             /|");
            System.out.println("/_____________/ |");
            System.out.println("|             | /");
            System.out.println("|_____________|/");
            System.out.println();
        }

        if (count == 5) {
            if (!didHaveLetter) {
                System.out.println();
                System.out.println("Wrong!! Please Jeff has a family! Think about his children!");
            }
            System.out.println();
            System.out.println("      ______");
            System.out.println("      |/   |");
            System.out.println("      |    @");
            System.out.println("      |   \\|/");
            System.out.println("      |    |");
            System.out.println("      |   /");
            System.out.println("      |");
            System.out.println("  ____|_________");
            System.out.println(" /             /|");
            System.out.println("/_____________/ |");
            System.out.println("|             | /");
            System.out.println("|_____________|/");
            System.out.println();
        }

        if (count == 6) {
            if (!didHaveLetter) {
                System.out.println();
                System.out.println("Last chance!! Or Jeff might really die!");
            }
            System.out.println();
            System.out.println("      ______");
            System.out.println("      |/   |");
            System.out.println("      |    @");
            System.out.println("      |   \\|/");
            System.out.println("      |    |");
            System.out.println("      |   / \\ ");
            System.out.println("      |");
            System.out.println("  ____|______");
            System.out.println(" /             /|");
            System.out.println("/_____________/ |");
            System.out.println("|             | /");
            System.out.println("|_____________|/");
            System.out.println();
        }
    }

    public void loserMessageDisplay() {
            System.out.println();
            System.out.println("█▄█ █▀█ █░█ ▀ █░█ █▀▀   █▄▀ █ █░░ █░░ █▀▀ █▀▄   ░░█ █▀▀ █▀▀ █▀▀   ▀ ▄▀\n" +
                    "░█░ █▄█ █▄█ ░ ▀▄▀ ██▄   █░█ █ █▄▄ █▄▄ ██▄ █▄▀   █▄█ ██▄ █▀░ █▀░   ▄ ▀▄ ");
            System.out.println();
            System.out.println("      ______");
            System.out.println("      |/   |");
            System.out.println("      |    @");
            System.out.println("      |   /|\\");
            System.out.println("      |    |");
            System.out.println("      |   | |");
            System.out.println("      |");
            System.out.println("  ____|_________");
            System.out.println(" /             /|");
            System.out.println("/_____________/ |");
            System.out.println("|             | /");
            System.out.println("|_____________|/");
            System.out.println();
        }


    public void winnerMessageDisplay() {
        System.out.println("\n" +
                "█▄█ █▀█ █░█   █▀▄ █ █▀▄   █ ▀█▀ █   █▄█ █▀█ █░█   █▀ ▄▀█ █░█ █▀▀ █▀▄   ░░█ █▀▀ █▀▀ █▀▀ █   ▀ ▀▄\n" +
                "░█░ █▄█ █▄█   █▄▀ █ █▄▀   █ ░█░ ▄   ░█░ █▄█ █▄█   ▄█ █▀█ ▀▄▀ ██▄ █▄▀   █▄█ ██▄ █▀░ █▀░ ▄   ▄ ▄▀");
        System.out.println();
        System.out.println("      ______");
        System.out.println("      |/   |");
        System.out.println("      |     ");
        System.out.println("      |    You saved me!");
        System.out.println("      |    @");
        System.out.println("      |   \\|/");
        System.out.println("      |    |");
        System.out.println("  ____|___/_\\__");
        System.out.println(" /             /|");
        System.out.println("/_____________/ |");
        System.out.println("|             | /");
        System.out.println("|_____________|/");
        System.out.println();
    }

    public void welcomeToSaveJeffDisplay() {
        System.out.println();
        System.out.println();
        System.out.println("██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗     ███████╗ █████╗ ██╗   ██╗███████╗         ██╗███████╗███████╗███████╗\n" +
                "██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗    ██╔════╝██╔══██╗██║   ██║██╔════╝         ██║██╔════╝██╔════╝██╔════╝\n" +
                "██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║    ███████╗███████║██║   ██║█████╗           ██║█████╗  █████╗  █████╗  \n" +
                "██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║    ╚════██║██╔══██║╚██╗ ██╔╝██╔══╝      ██   ██║██╔══╝  ██╔══╝  ██╔══╝  \n" +
                "╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝    ███████║██║  ██║ ╚████╔╝ ███████╗    ╚█████╔╝███████╗██║     ██║     \n" +
                " ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝     ╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝     ╚════╝ ╚══════╝╚═╝     ╚═╝     \n" +
                "                                                                                                                                                             ") ;
        System.out.println("                  ░█▀▄░█▀█░░░█░█░█▀█░█░█░░░▀█▀░█░█░▀█▀░█▀█░█░█░░░█░█░█▀█░█░█░░░█▀▀░█▀█░█▀█░░░█▀▀░█▀█░█░█░█▀▀░░░▀▀█░█▀▀░█▀▀░█▀▀░▀▀█\n" +
                "                  ░█░█░█░█░░░░█░░█░█░█░█░░░░█░░█▀█░░█░░█░█░█▀▄░░░░█░░█░█░█░█░░░█░░░█▀█░█░█░░░▀▀█░█▀█░▀▄▀░█▀▀░░░░░█░█▀▀░█▀▀░█▀▀░░▀░\n" +
                "                  ░▀▀░░▀▀▀░░░░▀░░▀▀▀░▀▀▀░░░░▀░░▀░▀░▀▀▀░▀░▀░▀░▀░░░░▀░░▀▀▀░▀▀▀░░░▀▀▀░▀░▀░▀░▀░░░▀▀▀░▀░▀░░▀░░▀▀▀░░░▀▀░░▀▀▀░▀░░░▀░░░░▀░");

        System.out.println();
        System.out.println();
    }

    public void mainMenuLevelSelectionDisplay() {
        System.out.println("-------------------------------------------------");
        System.out.println("                     LEVELS                      ");
        System.out.println("-------------------------------------------------");
        System.out.println("(1) EASY : 5 - 6 Letter Words");
        System.out.println("(2) MEDIUM : 7 - 8 Letter Words");
        System.out.println("(3) HARD : 9 - 10 Letter Words");
        System.out.println();


    }

    public void makeAGuessMenuDisplay() {
        System.out.println("-------------------------------------------------");
        System.out.println("                  MAKE A GUESS                   ");
        System.out.println("-------------------------------------------------");
        System.out.println("(1) Guess The Word");
        System.out.println("(2) Guess A Letter");
        System.out.println();

    }


    public void promptForMenuSelection() {
        System.out.print("Please make your selection >>> ");

    }

    public void promptForGuess() {
        System.out.print("Please make your guess >>> ");
    }

    public String getMenuInput() {
        String inputString = "";
        boolean validInput = false;

        while (!validInput) {
            try {
                inputString = userInput.nextLine();

                if (inputString.matches("[a-zA-Z]+")) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a string without special characters or numbers.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid string.");
            }
        }

        return inputString;
    }

    public int getMainMenuInputNumber() {
    int inputNumber = 0;
    boolean validInput = false;

    while (!validInput) {
        try {
            inputNumber = Integer.parseInt(userInput.nextLine());

            if (inputNumber >= 1 && inputNumber <= 3) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                promptForGuess();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            promptForGuess();
        }
    } return inputNumber;
    }

    public int getMakeAGuessMenuInputNumber() {
        int inputNumber = 0;
        boolean validInput = false;

        while(!validInput) {
            try {
                inputNumber = Integer.parseInt(userInput.nextLine());

                if (inputNumber >= 1 && inputNumber <= 2) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 2.");
                    promptForGuess();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                promptForGuess();
            }
        } return inputNumber;
    }

    public char getMenuInputChar() {
        char inputChar = '\0';
        boolean validInput = false;

        while (!validInput) {
            try {
                String input = userInput.nextLine();

                if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                    inputChar = input.charAt(0);
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid letter.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid letter.");
            }
        }

        return inputChar;
    }

    public void preHangManImage() {

            System.out.println();
            System.out.println("      ______");
            System.out.println("      |/   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("  ____|_________");
            System.out.println(" /             /|");
            System.out.println("/_____________/ |");
            System.out.println("|             | /");
            System.out.println("|_____________|/");
            System.out.println();
        }

    public void printAlphabet(Set<Character> alphabet) {
        System.out.println("Available letters: " + alphabet);
        System.out.println();
    }

    public void invalidInputDisplay() {
        System.out.println("Please select a valid option");
    }


}


