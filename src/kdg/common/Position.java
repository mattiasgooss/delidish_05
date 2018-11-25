package kdg.common;

public class Position {
    private float longtitude;
    private float latitude;

    public Position(float longtitude, float latitude) {
        this.longtitude = longtitude;
        this.latitude = latitude;
    }

    //region getters en setters

    public float getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(float longtitude) {
        this.longtitude = longtitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    //endregion
}
