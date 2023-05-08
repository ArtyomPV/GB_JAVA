import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ThirdTask {
    private static ArrayList<String> planets  = null;

    public static void run() {
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
        System.out.println(planets);
        Iterator<String> iterator = planets.iterator();
        while(iterator.hasNext()){
            if(Collections.frequency(planets, iterator.next())>1){
                iterator.remove();;
            }
        }
        System.out.println(planets);
    }
}























