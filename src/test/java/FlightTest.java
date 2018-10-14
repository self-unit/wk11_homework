import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before() {
        flight = new Flight(plane, 37, Destinations.BERLIN);
        passenger = new Passenger("Steve");
        plane = new Plane(PlaneType.BOEING737, Airline.CATHAY_PACIFIC);
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasDestination() {

    }

    @Test
    public void hasNumber() {

    }
}
