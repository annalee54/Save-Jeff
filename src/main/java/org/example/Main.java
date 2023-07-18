package org.example;

public class Main {


    public static void main(String[] args) {

        Main main = new Main();
        main.run();
    }

    private void run() {

        RandomWordGeneratorService randomWordGeneratorService = new RandomWordGeneratorService();
        WordToGuess wordToGuess = new WordToGuess();
        ConsoleServices consoleServices = new ConsoleServices();
        GameMaker gameMaker = new GameMaker(randomWordGeneratorService, wordToGuess, consoleServices);
        MainMenu mainMenu = new MainMenu(gameMaker, randomWordGeneratorService);

        // run menu
        mainMenu.runMainMenu();

    }
    }


