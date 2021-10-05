package find.repeated.words.and.their.lengths;

import java.util.HashMap;
import java.util.Set;

public class FindRepeatedWordsAndTheirLengths {

    public static void main(String[] args) {

        findRepeatedWords("I am happy and well. I am happy as health. Nobody knows me very well that is why I am happy. But Still time has come to veil. As I am done with me.");


    }

    public static void findRepeatedWords(String str) {

        //converting string to lower case using ".toLowerCase()" method
        str = str.toLowerCase();

        //removing the fullstops in the sentences using ".replace" method
        str = str.replace(".", "");

        //splitting the String str into a String array of words using ".split()" method
        String[] words = str.split(" ");

        //creating a hashmap
        HashMap<String, Integer> repeatedWords = new HashMap<>();

        //to check each word in the array "words[]"
        for (String word : words) {

            //if a word is repeated in the key
            if (repeatedWords.containsKey(word)) {
                repeatedWords.put(word, repeatedWords.get(word) + 1);
            } else {
                repeatedWords.put(word, 1);
            }
        }

        //extracting all the keys of the map "repeatedWords"
        Set<String> wordsInString = repeatedWords.keySet();

        //looping through all the words in the Set "wordsInString"
        for (String word : wordsInString) {
            if (repeatedWords.get(word) > 1) {
                System.out.println("\"" + word + "\"" + " is repeated " + repeatedWords.get(word) + " times.");
            }
        }


    }
}
