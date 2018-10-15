public class Flight {

    private Plane plane;
    private static int flightNumber;
    private Destinations destination;

    public Flight(Plane plane, int flightNumber, Destinations destination) {
        this.destination = destination;
        this.plane = plane;
        this.flightNumber = flightNumber;
    }

    public Plane getPlane() {
        return plane;
    }

    public Destinations getDestination() {
        return destination;
    }

    public int getNumber() {
        return flightNumber;
    }
}
