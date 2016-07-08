package templatemethod;

import org.junit.Test;

public class CarConstructorTest {

    @Test
    public void testConstruct() throws Exception {
        CarConstructor personalCarContructor = new PersonalCarContructor();
        personalCarContructor.construct();

        CarConstructor transportCarConstructor = new TransportCarConstructor();

    }

}
