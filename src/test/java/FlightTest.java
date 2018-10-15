import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING737, Airline.CATHAY_PACIFIC);
        passenger = new Passenger("Steve");
        flight = new Flight(plane, 37, Destinations.BERLIN);
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasDestination() {
        assertEquals(Destinations.BERLIN, flight.getDestination());
    }

    @Test
    public void hasNumber() {

    }
}
