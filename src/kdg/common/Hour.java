package kdg.common;

public class Hour {
    private int hours;
    private int minutes;

    public Hour(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    //region getters en setters

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    //endregion
}
