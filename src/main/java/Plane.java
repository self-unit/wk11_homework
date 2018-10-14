import java.lang.reflect.Array;
import java.util.ArrayList;

public class Plane {
    private PlaneType type;
    private Airline airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType type, Airline airline) {
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public PlaneType getType() {
        return type;
    }

    public Airline getAirline() {
        return airline;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}
