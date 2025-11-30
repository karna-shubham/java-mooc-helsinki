
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
public class Checker {
    
    public boolean isDayOfWeek(String string){
        
        if (string == null || string.isEmpty()) return false;
        return string.matches("(?i)^|mon|tue|wed|thu|fri|sat|sun");
    }
    
    public boolean allVowels(String string){
        if (string == null || string.isEmpty()) return false;
        return string.matches("(?i)^[aeiou]+$");
//        List<String> inputs = Arrays.asList(string.split(""));
//        long result = inputs.stream()
//                .filter(i -> i.matches("(?i)^a|e|i|o|u"))
//                .count();
//        return result == string.length();
    }
    
    public boolean timeOfDay(String string) {
        if (string == null) return false;

        return string.matches("^([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$");
}

}
