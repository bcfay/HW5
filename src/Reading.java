public class Reading {
    private Time time;
    private double temperature;
    private double rainfall;

    public Reading(Time time, double temperature, double rainfall) {
        this.time = time;
        this.temperature = temperature;
        this.rainfall = rainfall;
    }

    /**
     * getter method for the time
     * @return time
     */
    public Time getTime() {
        return time;
    }

    /**
     * setter method for time
     * @param time
     */
    public void setTime(Time time) {
        this.time = time;
    }

    /**
     * getter method for temperature
     * @return temperature
     */

    public double getTemperature() {
        return temperature;
    }

    /**
     * setter method for temperature
     * @param temperature
     */

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Getter method for rainfall
     * @return rainfall
     */
    public double getRainfall() {
        return rainfall;
    }

    /**
     * setter method for rainfall
     * @param rainfall
     */
    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }
}
