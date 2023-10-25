package day5;

import java.util.ArrayList;
import java.util.List;

class Util {

    public static void printCitiesWithLength(List<String> cities, int length) {
        for (String city : cities) {
            if (city.length() > length) {
                System.out.println(city);
            }
        }
    }

    public static void printCitiesWithCharacter(List<String> cities, char character) {
        for (String city : cities) {
            if (city.charAt(0) == character) {
                System.out.println(city);
            }
        }
    }
}



public class Test {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("New Delhi");
        cities.add("Chennai");
        cities.add("Kolkata");

        Util.printCitiesWithLength(cities, 5);

        Util.printCitiesWithCharacter(cities, 'C');
    }
}