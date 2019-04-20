public class StringUtils {
    
    public static boolean included(String word, String searched) {
        String returnString = "";
        String returnStringCaps = "";
        
        returnString = searched.trim();
        returnStringCaps = returnString.toUpperCase();
        
        if (word.contains(returnString) || word.contains(returnStringCaps)) {
            return true;
        }
        
        if ((word != null && !word.equals("")) ||(searched != null && !searched.equals(""))) {
            return false;
        }
    return false;
    }
}
