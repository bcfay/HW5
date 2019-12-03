import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface IWeatherData {

        GregorianCalendar getDate();
        double getTemperature();
        double getRainfall();

    }
