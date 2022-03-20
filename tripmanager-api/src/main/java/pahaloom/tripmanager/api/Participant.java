package pahaloom.tripmanager.api;

public class Participant {
    private String name;

    private String email;
    private boolean isTransportRequired;
    private TransportType transportType;
    private short numSeats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTransportRequired() {
        return isTransportRequired;
    }

    public void setTransportRequired(boolean transportRequired) {
        isTransportRequired = transportRequired;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public short getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(short numSeats) {
        this.numSeats = numSeats;
    }
}
