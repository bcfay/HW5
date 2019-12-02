public class Reading {
    private Time time;
    private double temperature;
    private double rainfall;

    public Reading(Time time, double temperature, double rainfall) {
        this.time = time;
        this.temperature = temperature;
        this.rainfall = rainfall;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getRainfall() {
        return rainfall;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }
}
