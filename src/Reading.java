public class Reading {
    private Time time;
    private double tempurature;
    private double rainfall;

    public Reading(Time time, double tempurature, double rainfall) {
        this.time = time;
        this.tempurature = tempurature;
        this.rainfall = rainfall;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public double getTempurature() {
        return tempurature;
    }

    public void setTempurature(double tempurature) {
        this.tempurature = tempurature;
    }

    public double getRainfall() {
        return rainfall;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }
}
