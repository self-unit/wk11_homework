import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING737, Airline.CATHAY_PACIFIC);
    }

    @Test
    public void hasType() {
        assertEquals(PlaneType.BOEING737, plane.getType());
    }

    @Test
    public void hasAirline() {
        assertEquals(Airline.CATHAY_PACIFIC, plane.getAirline());
    }
}
