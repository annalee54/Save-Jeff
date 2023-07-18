package org.example;
import org.springframework.web.client.RestTemplate;
public class RandomWordGeneratorService {

    private static final String API_BASE_URL = "https://random-word-api.herokuapp.com/word?length=";
    private static final RestTemplate restTemplate = new RestTemplate();
    



    public WordToGuess wordToGuess(int wordLength) { // length would go in as input end point 
            String[] obj = restTemplate.getForObject(API_BASE_URL + wordLength, String[].class);
            WordToGuess wordToGuess = new WordToGuess();
            wordToGuess.setWord(obj[0]);
            return wordToGuess;
        }


}
