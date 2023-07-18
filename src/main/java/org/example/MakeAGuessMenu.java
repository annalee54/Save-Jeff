package org.example;

public class MakeAGuessMenu {

    ConsoleServices consoleServices;
    GameMaker gameMaker;
    RandomWordGeneratorService randomWordGeneratorService;
    MainMenu mainMenu;

    public MakeAGuessMenu(GameMaker gameMaker, MainMenu mainMenu) {
        this.gameMaker = gameMaker;
        RandomWordGeneratorService randomWordGeneratorService = new RandomWordGeneratorService();
        consoleServices = new ConsoleServices();
        this.mainMenu = mainMenu;

    }

    public void runMakeAGuessMenu() {
        int makeAGuessMenuInput;
        String wordGuess;


        consoleServices.makeAGuessMenuDisplay();
        consoleServices.promptForMenuSelection();
        makeAGuessMenuInput = consoleServices.getMakeAGuessMenuInputNumber();

        do {
            if (makeAGuessMenuInput == 1) {
                consoleServices.promptForGuess();
                if (gameMaker.guessedTheWord()) {
                    consoleServices.winnerMessageDisplay();
                } else {
                    consoleServices.loserMessageDisplay();
                    System.out.println("Correct word was: " + gameMaker.getWordToGuess());
                }
                gameMaker.isGameOver();
                System.exit(0);
            }

            if (makeAGuessMenuInput == 2) {
                    boolean rightGuess = false;
                do {
                    gameMaker.getFinalWordSlot();
                    consoleServices.hangmanImage(gameMaker.count, rightGuess);
                    consoleServices.printAlphabet(gameMaker.alphabet);
                    consoleServices.promptForGuess();
                    char letterToRemove = consoleServices.getMenuInputChar();

                    if (!gameMaker.alphabet.contains(Character.toUpperCase(letterToRemove))) {
                        System.out.println("You've already guessed that letter. Please make another guess!");
                        continue;
                    }
                    gameMaker.removeLettersInAlphabet(letterToRemove);
                    rightGuess = gameMaker.changeWordSlot(letterToRemove);

                } while (!gameMaker.isGameOver());

                if (gameMaker.isWinner()) {
                    System.out.println("Word to guess was: " + gameMaker.getWordToGuess());
                    consoleServices.winnerMessageDisplay();
                } else {
                    consoleServices.loserMessageDisplay();
                    System.out.println("Correct word was: " + gameMaker.getWordToGuess());
                    } System.exit(0);
                }
        } while (!gameMaker.isGameOver());
    }
}

