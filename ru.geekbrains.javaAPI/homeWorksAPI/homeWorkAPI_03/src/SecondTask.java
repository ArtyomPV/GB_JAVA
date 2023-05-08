import java.util.ArrayList;
import java.util.Iterator;

public class SecondTask {

    public static ArrayList<Integer> removeEven(ArrayList<Integer> array){
        Iterator<Integer> iterator = array.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%2 == 0){
                iterator.remove();
            }
        }
        return array;
    }
}
