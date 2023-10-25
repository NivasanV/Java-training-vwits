import java.util.*;

public class Util {

    public static void printCitiesConditionally(List<String> cities, Condition c){
        for(String name:cities){
            if(c.check(name)){
                System.out.println(name);
            }
        }
    }

    public static void printCitiesGreaterThan(List<String> cities, int length) {
        for (String city : cities) {
            if (city.length() > length) {
                System.out.println(city);
            }
        }
    }

    public static void printCitiesCharacter(List<String> cities, char character) {
        for (String city : cities) {
            if (city.charAt(0) == character) {
                System.out.println(city);
            }
        }
    }
}