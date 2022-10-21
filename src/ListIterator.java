//Manideep Nalluri - 1225915641
import java.util.*;

public class ListIterator {
    public ListIterator() {
        System.out.println("Implementing Iterator design pattern");
    }

    public static Iterator<Integer> range(int start, int end) {
        return new Iterator<>() {
            private int index = start;

            @Override
            public boolean hasNext() {
                return index < end;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return index++;
            }
        };
    }


    public static void helper(ArrayList<String> productName, HashMap<String, String> map) {
        var iterator = range(0, productName.toArray().length);
        Set<String> s = map.keySet();

        while (iterator.hasNext()) {
            int i = 0;
            while (iterator.hasNext()) {

                if(s.contains("Meat")) {
                    System.out.println("Meat");
                    i = i+1;
                } else {
                    System.out.println("Produce");
                }
                if( i== 3) {
                    s.remove("Meat");
                }
            System.out.println(productName.get(iterator.next()));
        }
        }

    }
}
