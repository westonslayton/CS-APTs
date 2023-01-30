import java.util.*;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        List<String> ingredients = Arrays.asList(available);
        for(int i = 0; i < orders.length; i++){
            String[] desires = orders[i].split(" ");
            boolean works = true;
            for(String item : desires){
                if(!ingredients.contains(item)){
                    works = false;
                    break;
                }
            }
            if(works){return i;}
        }  
        return -1;
    }
 }
