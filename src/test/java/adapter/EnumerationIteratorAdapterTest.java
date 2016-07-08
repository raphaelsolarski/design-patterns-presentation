package adapter;

import org.junit.Assert;
import org.junit.Test;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class EnumerationIteratorAdapterTest {

    @Test
    public void testAdapter() throws Exception {
        Hashtable<String, Integer> hashTable = new Hashtable<>();
        hashTable.put("foo", 256);
        hashTable.put("bar", 512);

        Enumeration<Integer> enumeration = hashTable.elements();
        printAll(new EnumerationIteratorAdapter<>(enumeration));

        enumeration = hashTable.elements();
        Integer result = sumAllElements(new EnumerationIteratorAdapter<>(enumeration));
        Assert.assertEquals(768, result.intValue());
    }

    private <T> void printAll(Iterator<T> iterator) {
        iterator.forEachRemaining(System.out::println);
    }

    private Integer sumAllElements(Iterator<Integer> iterator) {
        Integer sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }
}