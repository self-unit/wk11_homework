import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> hangar;
    private ArrayList<Flight> flights;
    private int tickets;

    public Airport() {
        this.hangar = new ArrayList<>();
        this.tickets = 0;
        this.flights = new ArrayList<>();
    }

    public ArrayList<Plane> getHangarPlanes() {
        return hangar;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void createFlight(Plane plane, int flightNumber, Destinations destination) {
        Flight newFlight = new Flight(plane, flightNumber, destination);
        flights.add(newFlight);
    }

    public void assignPlaneToFlight(Plane plane, Flight flight) {
    }

    public void addFlightToHangar(Flight flight) {
        flights.add(flight);
    }
}
