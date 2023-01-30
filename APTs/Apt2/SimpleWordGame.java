    import java.util.*;
  
  public class SimpleWordGame {
      public int points(String[] player, String[] dictionary) {
        HashSet<String> playerWords = new HashSet<>(Arrays.asList(player));
        HashSet<String> dictionaryWords = new HashSet<>(Arrays.asList(dictionary));


        int count = 0;
        /* 
        for(String word : playerWords){
            if(dictionaryWords.contains(word)){
                count += (word.length() * word.length());
            }
        }
        return count;
         */

         playerWords.retainAll(dictionaryWords);
         for (String word : playerWords){
            count += (word.length() * word.length());
         }
         return count;
        // this method uses retainAll method instead of contatins.

      }
  }