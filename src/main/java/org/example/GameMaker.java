package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameMaker {

    RandomWordGeneratorService randomWordGeneratorService;
    private String wordSlots = " _";
    private String finalWordSlot = "";
    WordToGuess wordToGuess = new WordToGuess();
    ConsoleServices consoleServices;
    int count = 0;

    Set<Character> alphabet = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));
    Set<Character> guesses = new HashSet<>();

    public GameMaker(RandomWordGeneratorService randomWordGeneratorService, WordToGuess wordToGuess, ConsoleServices consoleServices) {
        this.randomWordGeneratorService =  randomWordGeneratorService;
        this.wordToGuess = wordToGuess;
        this.consoleServices = consoleServices;
    }

    public String buildWordSlot(String word) {
        for (int i = 0; i < word.length(); i++) {
            finalWordSlot += wordSlots;
        }
        System.out.println();
        System.out.println("Word to Guess: " + finalWordSlot);
        return finalWordSlot;
    }

    public boolean changeWordSlot(char letterGuessed) {
        String wordGuess = wordToGuess.getWord();
        boolean didHaveLetter = false;

        finalWordSlot = "";

        for (int i = 0; i < wordGuess.length(); i++) {
            if (guesses.contains(Character.toUpperCase(wordGuess.charAt(i)) )) {
                finalWordSlot += " " + wordGuess.charAt(i);

            } else if (Character.toLowerCase(wordGuess.charAt(i)) == Character.toLowerCase(letterGuessed)) {
                didHaveLetter = true;
                finalWordSlot += " " + letterGuessed;
            } else {
                finalWordSlot += wordSlots;
            }
        }
        if (!didHaveLetter) {
            count++;
        }

        guesses.add(Character.toUpperCase(letterGuessed));

        return didHaveLetter;
    }

    public int generateRandomNumber(int min, int max) {
         int random = (int) ((Math.random() * (max - min)) + min);
        return random;
    }



    public String getRandomWord(String level) {
        if (level.equalsIgnoreCase("easy")) {
            wordToGuess = randomWordGeneratorService.wordToGuess(generateRandomNumber(5, 7));
        } else if (level.equalsIgnoreCase("medium")) {
            wordToGuess = randomWordGeneratorService.wordToGuess(generateRandomNumber(7, 9));
        } else if (level.equalsIgnoreCase("hard")) {
            wordToGuess = randomWordGeneratorService.wordToGuess(generateRandomNumber(9, 11));
        }

        return wordToGuess.getWord();
    }
    public void makeAGuess() {

    }

 public boolean guessedTheWord() {
    if ((wordToGuess.getWord()).equals(consoleServices.getMenuInput())) { //need to check if the userinput is the same as the random word generated
        return true;
    } else {
        return false;
       }
    }

    public String getWordToGuess() {
        return wordToGuess.getWord();
    }

    public void getFinalWordSlot() {
        System.out.println();
        System.out.println("Word to guess: " + finalWordSlot);
    }

    public Set<Character> getAlphabet() {
        return alphabet;
    }
    public void removeLettersInAlphabet(char letterToRemove) {
        alphabet.remove(Character.toUpperCase(letterToRemove));
    }

    public boolean isGameOver() {
        if (isWinner()) {
            return true;
        }
        if (isLoser()) {
            return true;
        } return false;
    }

    public boolean isWinner() {
       if (!finalWordSlot.contains(wordSlots) && count < 7) {
           return true;
        } else {
           return false;
       }
    }

    public boolean isLoser() {
        if (count > 6) {
            return true;
        } else {
            return false;
        }
    }


}