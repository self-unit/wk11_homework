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

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }
}
