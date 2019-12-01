import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport {
    GregorianCalendar date;
    LinkedList temperature;
    LinkedList rainfall;


    public DailyWeatherReport(GregorianCalendar date, LinkedList temperature, LinkedList rainfall) {
        this.date = date;
        this.temperature = temperature;
        this.rainfall = rainfall;
    }
}
