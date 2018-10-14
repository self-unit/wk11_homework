public class Plane {
    private PlaneType type;
    private Airline airline;

    public Plane(PlaneType type, Airline airline) {
        this.type = type;
        this.airline = airline;
    }

    public PlaneType getType() {
        return type;
    }

    public Airline getAirline() {
        return airline;
    }
}
