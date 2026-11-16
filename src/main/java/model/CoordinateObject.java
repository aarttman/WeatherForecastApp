package model;

public class CoordinateObject {
    private double latitude;
    private double longitude;

    public CoordinateObject(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }
}
