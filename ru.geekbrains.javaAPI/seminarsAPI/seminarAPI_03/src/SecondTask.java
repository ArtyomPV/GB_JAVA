import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Заполните список названиями планет Солнечной системы в произвольном порядке с повторениями
 * вывести названия каждой планеты и количество его повторений в список
 */
public class SecondTask {
    private static ArrayList<String> planets  = null;

    public static void run(){
         planets = new ArrayList<>();
         planets.add("Venera");
         planets.add("Mercury");
         planets.add("Earth");
         planets.add("Mars");
         planets.add("Uran");
         planets.add("Pluto");
         planets.add("Mars");
         planets.add("Venera");
         planets.add("Pluto");
         planets.add("Earth");
         planets.add("Mars");
        shortPrintUniqPlanets(planets);

        System.out.println("------------------------");
        findRepeatedPlanets( planets);




    }
private static ArrayList<String> shortPrintUniqPlanets(ArrayList<String> planets){
        ArrayList<String> uniqlanets = new ArrayList<>();
    for (int i = 0; i < planets.size(); i++) {
        for (int j = 0; j < planets.size(); j++) {
            if(i != j && !planets.get(i).equals(planets.get(j)) && !uniqlanets.contains(planets.get(i))){
                int count = Collections.frequency(planets, planets.get(i));
                System.out.println(planets.get(i) + " " + count);
                uniqlanets.add(planets.get(i));
            }
        }
    }
    return uniqlanets;
}
    private static ArrayList<String> uniqListPlanets(ArrayList<String> planets){
        ArrayList<String> newListPlanets = new ArrayList<>();


        for(String planet: planets){
            if (!newListPlanets.contains(planet)) {
                newListPlanets.add(planet);
            }
        }
        return  newListPlanets;
    }

    private static void findRepeatedPlanets(ArrayList<String> planets) {
        ArrayList<String> newListPlanets = uniqListPlanets(planets);
        int[] count = new int[newListPlanets.size()];
        for (int i = 0; i < newListPlanets.size(); i++) {
            for (int j = 0; j < planets.size(); j++) {
                    if(newListPlanets.get(i).equals(planets.get(j))){
                        count[i] ++;
                }
            }
            System.out.printf("%s: %d, ", newListPlanets.get(i), count[i]);
        }


    }

    private static ArrayList<String> addPlanet(String planet) {
        planets.add(planet);
        return planets;
    }





    public ArrayList<String> getPlanets() {
        return planets;
    }
}
