package decorator;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LoggingCollection<E> implements Collection<E> {

    private Collection<E> internal;

    public LoggingCollection(Collection<E> internall) {
        this.internal = internall;
    }

    @Override
    public int size() {
        return internal.size();
    }

    @Override
    public boolean isEmpty() {
        return internal.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return internal.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return internal.iterator();
    }

    @Override
    public Object[] toArray() {
        return internal.toArray();
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return internal.toArray(ts);
    }

    @Override
    public boolean add(E e) {
        System.out.println(e);
        return internal.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return internal.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return internal.containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        collection.stream().forEach(System.out::println);
        return internal.addAll(collection);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return internal.removeAll(collection);
    }

    @Override
    public boolean removeIf(Predicate<? super E> predicate) {
        return internal.removeIf(predicate);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return internal.retainAll(collection);
    }

    @Override
    public void clear() {
        internal.clear();
    }

    @Override
    public boolean equals(Object o) {
        return internal.equals(o);
    }

    @Override
    public int hashCode() {
        return internal.hashCode();
    }

    @Override
    public Spliterator<E> spliterator() {
        return internal.spliterator();
    }

    @Override
    public Stream<E> stream() {
        return internal.stream();
    }

    @Override
    public Stream<E> parallelStream() {
        return internal.parallelStream();
    }

    @Override
    public void forEach(Consumer<? super E> consumer) {
        internal.forEach(consumer);
    }
}
