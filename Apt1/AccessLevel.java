public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
       String key = "";
       for(int i = 0; i < rights.length; i++){
              if(rights[i] < minPermission){
                  key += "D";
              }
              else{
                   key += "A"; 
              }
       }
       return key;
       }
}