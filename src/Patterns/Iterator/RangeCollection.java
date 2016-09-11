package Patterns.Iterator;/*  Created by Ilyasov Damir on 10.09.2016. */

import java.util.NoSuchElementException;

public class RangeCollection {
    private int min;
    private int max;
    private int size;

    public RangeCollection(int min, int max) {
        this.min = min;
        this.max = max;
        size = max - min + 1;
    }

    public RangeCollection(int max) {
        this(0, max);
    }

    public RangeCollection() {
        this(0);
    }

    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator<Integer> {
        private int poss = min;


        @Override
        public boolean hasNext() {
            if (poss == size) {
                throw new NoSuchElementException("Cant find elements");
            }
            return true;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                poss++;
                return (poss-1);
            }
            return null;
        }
    }
}
