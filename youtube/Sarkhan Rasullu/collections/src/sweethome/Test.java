package sweethome;

import java.util.Iterator;

public class Test<T> implements Iterable<T> {

    @Override
    public Iterator<T> iterator() {
        return null;
    }



    class Myiterator implements Iterator<T>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }

}
