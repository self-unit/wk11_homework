import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Passenger passenger;
    Plane plane;

    @Before
    public void before() {
        passenger = new Passenger("Steve");
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

    @Test
    public void canAddPassenger() {
        plane.addPassenger(passenger);
        assertEquals(1, plane.getPassengers().size());
    }

}
