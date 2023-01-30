import java.util.*;

public class TxMsg {

    public boolean isVowel(char x){
        if(x == 'a'){return true;}
        else if(x == 'e'){return true;}
        else if(x == 'i'){return true;}
        else if(x == 'o'){return true;}
        else if(x == 'u'){return true;}
        else{return false;}
    }

    public boolean allVowels(String word){
        char[] ca = word.toCharArray();
        for (int i = 0; i < ca.length; i++){
            if(isVowel(ca[i])){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    
    public String convert(String word){
        if(allVowels(word)){return word;}
        char[] ca = word.toCharArray();
        String shortWord = "";
        for (int i = 0; i < ca.length; i++){
            if(
                (!isVowel(ca[i]))
                &&
                (i == 0 || isVowel(ca[i-1]))                 
            ){
               shortWord += ca[i]; 
            }
        }
        return shortWord;
    }

    public String getMessage(String original){
        String[] data = original.split(" ");
        String[] ret = new String[data.length];

        for(int k = 0; k < data.length; k++){
            ret[k] = convert(data[k]);
        }
        return String.join(" ", ret);
    }
}
