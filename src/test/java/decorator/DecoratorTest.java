package decorator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class DecoratorTest {

    @Test
    public void loggingCollectionTest() throws Exception {
        Collection<Integer> collection = new LoggingCollection<>(new ArrayList<>());
        collection = new LoggingCollection<>(collection);
        collection.add(1);
        collection.add(2);

//        collection.addAll(Arrays.asList(1, 2, 3));
    }

}
