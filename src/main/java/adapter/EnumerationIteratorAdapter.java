package adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdapter<T> implements Iterator<T> {

    private Enumeration<T> enumeration;

    public EnumerationIteratorAdapter(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return enumeration.nextElement();
    }

}
