//Manideep Nalluri - 1225915641
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;
public class IteratorPatteren {
    public IteratorPatteren() {
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

    public static void helper(ArrayList<String> productname) {
        var iterator = range(0, productname.toArray().length);
        while (iterator.hasNext()) {
            System.out.println(productname.get(iterator.next()));
        }
    }
}
