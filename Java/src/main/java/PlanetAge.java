import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PlanetAge {

    private HashMap<String, Double> planets;

    public PlanetAge() {
        this.planets = new HashMap<String, Double>() {{
            put("Mercury", 0.2408467);
            put("Venus", 0.61519726);
            put("Mars", 1.8808158);
            put("Jupiter", 11.862615);
            put("Saturn", 29.447498);
            put("Uranus", 84.016846);
            put("Neptune", 164.79132);
            put("Pluto", 248.00);
        }};
    }

    public double calculateEarthAgeInSeconds(int earthAge) {
        return  earthAge * 365.25 * 24 * 60 * 60;
    }

    public double getEarthAgeFromSeconds(double seconds) {
        double age = (seconds / 365.25 /24 / 60 / 60);
        return Math.floor(age);
    }

    public ArrayList getAllAgesFromYears(double age) {
        ArrayList allAges = new ArrayList<String>();
        for (String pair : planets.keySet()) {
            double planetAge = age / planets.get(pair);
            allAges.add("Your " + pair + " age is " + planetAge);
        }
        return allAges;
    }

    public ArrayList getAllAgesFromSeconds(int seconds) {
        ArrayList allAges = new ArrayList<String>();
        double age = getEarthAgeFromSeconds(seconds);
        allAges.add("Your Earth age is " + age);
        for (String pair : planets.keySet()) {
            double planetAge = age / planets.get(pair);
            allAges.add("Your " + pair + " age is " + planetAge);
        }
        return allAges;
    }

    public void printAgesToTerminal(ArrayList<String> ageList) {
        for (String ageString : ageList) {
            System.out.println(ageString);
        }
    }


}

//    public double getMercuryAge() {
//        return earthAge / 0.2408467;
//    }
//
//    public double getVenusAge() {
//        return earthAge / 0.61519726;
//    }
//
//    public double getMarsAge() {
//        return earthAge / 1.8808158;
//    }
//
//    public double getJupiterAge() {
//        return earthAge / 11.862615;
//    }
//
//    public double getSaturnAge() {
//        return earthAge / 29.447498;
//    }
//
//    public double getUranusAge() {
//        return earthAge / 84.016846;
//    }
//
//    public double getNeptuneAge() {
//        return earthAge / 164.79132;
//    }
//
//    public double getPlutoAge() {
//        return earthAge / 248.00;
//    }


