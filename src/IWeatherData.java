import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface IWeatherData {

        GregorianCalendar getDate();
        LinkedList getTemperatureList();
        LinkedList getRainfallList();
        double getTemperature();
        double getRainfall();

    }
