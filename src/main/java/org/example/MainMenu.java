package org.example;

public class MainMenu {


    private ConsoleServices consoleServices;
    private GameMaker gameMaker;
    private MakeAGuessMenu makeAGuessMenu;
    private RandomWordGeneratorService randomWordGeneratorService;
    MainMenu mainMenu;

    public MainMenu(GameMaker gameMaker, RandomWordGeneratorService randomWordGeneratorService) {

        this.gameMaker = gameMaker;
        makeAGuessMenu = new MakeAGuessMenu(gameMaker, mainMenu);
        consoleServices = new ConsoleServices();
    }

    public void runMainMenu() {
        consoleServices.welcomeToSaveJeffDisplay();


        int menuSelection = -1;
        while (menuSelection != 0) {
                consoleServices.mainMenuLevelSelectionDisplay();
                consoleServices.promptForMenuSelection();
                menuSelection = consoleServices.getMainMenuInputNumber(); //if I use getMenuInput multiple times, does it requ
            if (menuSelection == 1) {
                gameMaker.buildWordSlot(gameMaker.getRandomWord("easy"));
                consoleServices.preHangManImage();
                makeAGuessMenu.runMakeAGuessMenu();
            } else if (menuSelection == 2) {
                gameMaker.buildWordSlot(gameMaker.getRandomWord("medium"));
                consoleServices.preHangManImage();
                makeAGuessMenu.runMakeAGuessMenu();
            } else if (menuSelection == 3) {
                gameMaker.buildWordSlot(gameMaker.getRandomWord("hard"));
                consoleServices.preHangManImage();
                makeAGuessMenu.runMakeAGuessMenu();

            }


        }
    }
}
