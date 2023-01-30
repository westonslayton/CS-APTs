import java.util.HashSet;

public class Starter {
     public int begins(String[] words, String first) {
       HashSet<String> wordsNew = new HashSet<String>();
         for (String word : words) {
            if (word.indexOf(first)==0) {
                wordsNew.add(word);
            }
        }
       return wordsNew.size();
     }
 }