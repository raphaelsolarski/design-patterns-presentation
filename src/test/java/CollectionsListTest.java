import org.junit.Test;

import java.util.Collections;
import java.util.Hashtable;

public class CollectionsListTest {

    @Test
    public void listTest() throws Exception {
        Collections.list(new Hashtable().elements());
    }
}
