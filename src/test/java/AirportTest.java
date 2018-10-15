import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Plane plane1;
    Plane plane2;
    Plane plane3;
    Airport airport;
    Flight flight1;
    Flight flight2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void before() {
        passenger1 = new Passenger("Steve");
        passenger2 = new Passenger("Gemma");
        passenger3 = new Passenger("Katarina");
        passenger4 = new Passenger("Johnny");
        plane1 = new Plane(PlaneType.BOEING737, Airline.CATHAY_PACIFIC);
        plane2 = new Plane(PlaneType.AIRBUS320, Airline.ALL_NIPPON_AIRWAYS);
        plane3 = new Plane(PlaneType.BOEING767, Airline.SINGAPORE_AIRLINES);
        flight1 = new Flight(plane1, 37, Destinations.BERLIN);
        flight2 = new Flight(plane2, 44, Destinations.SYDNEY);
        airport = new Airport();
    }

    @Test
    public void hasEmptyHangar() {
        assertEquals(0, airport.getHangarPlanes().size());
    }

    
}
