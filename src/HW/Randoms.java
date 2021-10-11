package HW;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    private List<Integer> intList = new LinkedList<>();
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    public int addNumber() {
        int num = random.nextInt(max - min + 1) + min;
        this.intList.add(num);
        return num;
    }

    public List<Integer> getList() {
        return this.intList;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            int nextIndex = 0;

            @Override
            public boolean hasNext() {
                 return nextIndex < intList.size();
            }

            @Override
            public Integer next() {
                    Integer current = intList.get(nextIndex);
                    nextIndex++;
                    return current;
            }
        };
    }
}
