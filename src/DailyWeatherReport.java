import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport implements IWeatherData {
    private GregorianCalendar date;
    private LinkedList temperature;
    private LinkedList rainfall;


    public DailyWeatherReport(GregorianCalendar date, LinkedList temperature, LinkedList rainfall) {
        this.date = date;
        this.temperature = temperature;
        this.rainfall = rainfall;
    }

    /**
     * A getter method for the date
     * @return date
     */
    public GregorianCalendar getDate() {
        return date;
    }

    /**
     * Getter method for Temperature List
     * @return temperature list
     */
    public LinkedList getTemperatureList() {
        return temperature;
    }

    /**
     * getter method for the list of Rainfall
     * @return list of rainfall
     */
    public LinkedList getRainfallList() {
        return rainfall;
    }

    /**
     * getter method for sum of each temperature in a list
     * @return sum of each temperature in the list
     */

    public double getTemperature(){
        return sumList(this.temperature);
    }

    /**
     * getter method for sum of each rainfall
     * @return sum of each rainfall list
     */

    public double getRainfall(){
        return sumList(this.rainfall);
    }

    /**
     * gets the sum of an input list of doubles, used for each rainfall and temperature
     * @param readings
     * @return sum of readings
     */

    private double sumList(LinkedList<Double> readings){
        double sum=0;
        for(double i :readings){
            sum+=i;
        }
        return sum;
    }
}
