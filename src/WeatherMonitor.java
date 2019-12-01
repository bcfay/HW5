import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {

    LinkedList reports;

    public WeatherMonitor(LinkedList reports) {
        this.reports = reports;
    }

    public WeatherMonitor() {
        this.reports = new LinkedList();
    }

    public float averageTempForMonth(int month, int year){

        return 0;
    }

    public float totalRainfallForMonth(int month){
        return 0;
    }

    public void addDailyReport(GregorianCalendar date, LinkedList readings){

    }


}
